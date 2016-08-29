package com.lhy.factory;

public class Dog extends Animal {
	@Override
	public void eat() {
		super.eat();
		System.out.println("狗喜欢吃屎");
	}
}
