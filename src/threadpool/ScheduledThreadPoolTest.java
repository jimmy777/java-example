package threadpool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author Y.Z.Y
 * @Date 2020/12/25 8:52
 * @Description
 */
public class ScheduledThreadPoolTest {

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);

        for (int i = 0; i < 3; i++) {
            Task task = new Task("task-" + i);

            scheduledThreadPool.scheduleAtFixedRate(task, 0, 5, TimeUnit.SECONDS);
        }

        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Shutting down executor...");

        scheduledThreadPool.shutdown();

        boolean isDone;

        do {
            isDone = scheduledThreadPool.awaitTermination(1, TimeUnit.DAYS);
            System.out.println("awaitTermination...");
        } while(!isDone);

        System.out.println("Finished all threads.");
    }
}

class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("name=" + name + "\tstartTime=" + new Date());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("name=" + name + "\tendTime=" + new Date());
    }
}
