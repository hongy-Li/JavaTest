package com.lhy.factory;

public class Cat extends Animal {
	@Override
	public void eat() { 
		super.eat();
		System.out.println("猫喜欢吃鱼");
	}
}
