package com.x.base.thread;

public class TicketThreadDemo implements Runnable {

	// 保护的数据要 private 修饰
	private int  tickets = 50;
	
	@Override
	public void run() {
		// 锁1
		while(getTickets() > 0 ) {
			// 锁2. 同步代码块，锁住代码块
			synchronized (this) {
				if (tickets >0) {
					System.out.println("第 "+tickets+" 号的票已被 "+ Thread.currentThread().getName() +" 线程售出" );
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					tickets--;
				}
			}
		}
	}
	
	// 1. 同步方法，锁住方法
	private synchronized int getTickets() {
		return tickets;
	}



	public static void main(String[] args) {
		TicketThreadDemo r = new TicketThreadDemo();
		new Thread(r, "售票窗口1").start();
		new Thread(r, "售票窗口2").start();
		new Thread(r, "售票窗口3").start();
		new Thread(r, "售票窗口4").start();
	}

}
