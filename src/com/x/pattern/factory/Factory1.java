package com.x.pattern.factory;

public class Factory1 extends AbstractFactory {

	@Override
	public Moveable createMoveable() {
		return null;
	}

	@Override
	public Flyable createFlyable() {
		return new Aircraft();
	}

	@Override
	public Writeable createWriteable() {
		return null;
	}
}
