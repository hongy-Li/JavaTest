package com.lhy.factory;

import net.sf.json.JSON;
import net.sf.json.JSONObject;

public class AnimalFactory {
	static Animal mAnimal;
	/**
	 * 第一种方法
	 * @param type
	 * @return
	 */
	public static Animal creatAnimal(String type){
		
		switch (type) {
		case "cat":
			mAnimal=new Cat();
			break;
		case "dog":
			mAnimal=new Dog();
			break;
		default:
			break;
		}
		return mAnimal;
	}
	/**
	 * 第二种方法
	 * @param c
	 * @return
	 */
	public static <T extends Animal> T creatAnimal(Class<T> c){
		Animal animal=null;
		try {
			animal=(T)Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (T)animal;
		
	}
}
