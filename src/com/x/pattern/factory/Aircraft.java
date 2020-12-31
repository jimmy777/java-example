package com.x.pattern.factory;

public class Aircraft implements Flyable {

	@Override
	public void fly(int height) {
		System.out.println("我是一架客运飞机，目前飞行高度为：" + height + "千米。");
	}
}
