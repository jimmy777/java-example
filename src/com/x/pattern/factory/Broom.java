package com.x.pattern.factory;

/*
 * 定义实现产品的接口。比喻：如何生产一个产品。
 */
public class Broom implements Moveable {
	public void run() {
		System.out.println("这是一个扫把");
	}
}
