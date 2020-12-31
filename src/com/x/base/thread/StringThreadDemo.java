package com.x.base.thread;

import com.x.base.thread.threads.MyString;

public class StringThreadDemo implements Runnable{
	
	StringBuffer stringBuffer = new StringBuffer();
	StringBuilder stringBuilder = new StringBuilder();
	MyString sb = new MyString();

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			sb.append(1);
			stringBuffer.append("1");
			stringBuilder.append("1");
			System.out.println(sb.getNum() + "-" + stringBuffer.length() + "-" + stringBuilder.length());
		}
	}
	
	public static void main(String[] args) {
		StringThreadDemo r = new StringThreadDemo();
		new Thread(r, "线程1").start();
		new Thread(r, "线程2").start();
		new Thread(r, "线程3").start();
		new Thread(r, "线程4").start();
	}
}

