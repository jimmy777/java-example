package com.x.base.thread.threads;

public class Thread1 extends Thread {

	private String name;

	public Thread1(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " 运行：" + i);
			try {
				Thread.sleep((int)Math.random()*10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + " 执行结束");
	}
}
