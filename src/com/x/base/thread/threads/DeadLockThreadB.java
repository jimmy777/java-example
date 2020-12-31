package com.x.base.thread.threads;

/*
 * A和B两把锁，交叉持有。
 */
public class DeadLockThreadB extends Thread {
	private Object lockA;
	private Object lockB;
	
	public DeadLockThreadB(Object lockA, Object lockB) {
		this.lockA = lockA;
		this.lockB = lockB;
	}

	@Override
	public void run() {
		System.out.println("线程 B 开始执行了");
	
		synchronized (lockB) {
			System.out.println("LockB 已经线程 B 被锁住");
			
			try {
				Thread.sleep(100); // 确保锁住
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (lockA) {
				System.out.println("LockA 已经被线程 B 锁住");
			}
		}
	
	}
	
	
}
