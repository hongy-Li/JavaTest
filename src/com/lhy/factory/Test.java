package com.lhy.factory;

public class Test {

	public static void main(String[] args) {
		Animal animal=AnimalFactory.creatAnimal("cat");
		animal.eat();
		
		Dog dog=AnimalFactory.creatAnimal(Dog.class);
		dog.eat();
	}

}
