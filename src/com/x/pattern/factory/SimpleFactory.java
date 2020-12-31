package com.x.pattern.factory;

/*
 * 简单工厂模式(Simple Factory Pattern)
 */
public class SimpleFactory {
	// 创建对象方法
	public Object create(Class<?> clazz) {
		if(clazz.getName().equals(Plane.class.getName())) {
			return createPlane();
		} else if(clazz.getName().equals(Broom.class.getName())) {
			return createBroom();
		}
		return null;
	}
	
	// 创建具体对象的方法
	private Object createBroom() {
		return new Broom();
	}

	// 创建具体对象的方法
	private Object createPlane() {
		return new Plane();
	}
}
