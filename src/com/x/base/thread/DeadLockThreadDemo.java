package com.x.base.thread;

import com.x.base.thread.threads.DeadLockThreadA;
import com.x.base.thread.threads.DeadLockThreadB;

public class DeadLockThreadDemo {
	
	public static void main(String[] args) {
		Object locka = new Object();
		Object lockb = new Object();
		
		DeadLockThreadA threadA = new DeadLockThreadA(locka, lockb);
		DeadLockThreadB threadB = new DeadLockThreadB(locka, lockb);
		
		threadA.start();
		threadB.start();
	}

}
