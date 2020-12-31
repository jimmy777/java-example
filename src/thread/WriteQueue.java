package thread;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author Y.Z.Y
 * @Date 2020/12/14 8:57
 * @Description java 多线程读写文件示例。
 *
 *
 */
public class WriteQueue {

    private static final int MAX_QUEUE_SIZE = 10000;
    private LinkedList<String> queueCache = new LinkedList<>();
    private Lock lock = new ReentrantLock();
    private Condition full = lock.newCondition();
    private Condition empty = lock.newCondition();

    public WriteQueue() {
    }

    private static class WriteQueueHolder {
        private final static WriteQueue INSTANCE = new WriteQueue();
    }

    public static WriteQueue getInstance() {
        return WriteQueueHolder.INSTANCE;
    }

    public void add(String line) {
        lock.lock();
        try {
            while (queueCache.size() >= MAX_QUEUE_SIZE) {
                full.await();
            }
            queueCache.addFirst(line);
            empty.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void add(List<String> lineList) {
        lock.lock();
        try {
            while (queueCache.size() > MAX_QUEUE_SIZE) {
                full.await();
            }
            queueCache.addAll(lineList);
            empty.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public ArrayList<String> flush() {
        ArrayList<String> temp = null;

        lock.lock();
        try {
            while (queueCache.size() ==0 ) {
                empty.await();
            }
            temp = new ArrayList<>(queueCache);
            queueCache.clear();
            full.signal();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

        return temp;
    }

    public void showList() {
        for (String s : queueCache) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        WriteQueue w = WriteQueue.getInstance();
        w.add("hello, world.");
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("hello, java.");
        a1.add("hello, python.");
        w.add(a1);
        w.showList();

        ArrayList<String> flush = w.flush();
        System.out.println(flush);
    }
}
