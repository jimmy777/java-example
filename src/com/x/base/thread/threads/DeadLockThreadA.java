package com.x.base.thread.threads;

/*
 * A和B两把锁，交叉持有。
 */
public class DeadLockThreadA extends Thread {
	private Object lockA;
	private Object lockB;
	
	public DeadLockThreadA(Object lockA, Object lockB) {
		this.lockA = lockA;
		this.lockB = lockB;
	}

	@Override
	public void run() {
		System.out.println("线程 A 开始执行了");
	
		synchronized (lockA) {
			System.out.println("LockA 已经被线程 A 锁住");
			
			try {
				Thread.sleep(100); // 确保锁住
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (lockB) {
				System.out.println("LockB 已经被线程 A 锁住");
			}
		}
	
	}
	
	
}
