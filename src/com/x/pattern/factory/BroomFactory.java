package com.x.pattern.factory;

/*
 * 定义一个具体的实现工厂类。比喻：一个生产具体产品的车间。
 */
public class BroomFactory extends VehicleFactory {

	@Override
	public Moveable create() {
		return new Broom();
	}
}
