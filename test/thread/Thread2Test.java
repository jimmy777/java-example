package thread;

import org.junit.Test;

import com.x.base.thread.threads.BThread;

public class Thread2Test {

	@Test
	public void test() {
		BThread thread1 = new BThread("B thread");
		BThread thread2 = new BThread("B thread");
		
		thread1.start();
		thread2.start();
	}

}
