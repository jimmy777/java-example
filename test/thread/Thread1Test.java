package thread;

import org.junit.Test;

import com.x.base.thread.threads.Thread1;
import com.x.base.thread.threads.Thread2;

public class Thread1Test {

	@Test
	public void test() {
		Thread1 thread1 = new Thread1("A thread");
		Thread1 thread2 = new Thread1("B thread");
		
		thread1.start();
		thread2.start();
		
	}
	
	@Test
	public void test2() {
		Thread1 thread1 = new Thread1("A thread");
		Thread1 thread2 = thread1;
		
		thread1.start();
		thread2.start();
	}
	
	@Test
	public void test3() {
		Thread thread_c = new Thread(new Thread2("C thread"));
		Thread thread_d = new Thread(new Thread2("D thread"));
		
		thread_c.setPriority(Thread.MIN_PRIORITY);
		thread_c.start();
		System.out.println("C thread 的优先级： " + thread_c.getPriority());
		thread_d.setPriority(Thread.MAX_PRIORITY);
		//thread_d.start();
		//System.out.println("D thread 的优先级： " + thread_d.getPriority());
		
		try {
			thread_d.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
