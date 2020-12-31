package com.x.base.thread;

public class PriorityThreadDemo extends Thread{

	public PriorityThreadDemo(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName() + " 运行了第 " + i + " 次。");
			try { // 不能往上抛！重写的方法不能超过父类的方法。
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
		
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread 开始");
		PriorityThreadDemo t1 = new PriorityThreadDemo("A thread");
		PriorityThreadDemo t2 = new PriorityThreadDemo("B thread");
		
		// 设置优先级，但不一定是优先执行完。
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("main thread 结束");
	}
}
