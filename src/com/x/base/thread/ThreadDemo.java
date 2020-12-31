package com.x.base.thread;

import com.x.base.thread.threads.BThread;

public class ThreadDemo {

	public static void main(String[] args) {
		BThread thread1 = new BThread("B thread");
		BThread thread2 = new BThread("B thread");
		
		thread1.start();
		thread2.start();
	}
}
