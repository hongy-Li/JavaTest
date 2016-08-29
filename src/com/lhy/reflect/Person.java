package com.lhy.reflect;

import java.util.List;
import java.util.Map;

public class Person {
	public int age=14;
//	public String name="aaa";
	public int name=13;
	public static double gongzi;
	public Person(){
		System.out.println("我是无参构造函数");
	};
	public Person(String name){
		System.out.println("name is "+name);
	}
	public Person(String name,int age){
		System.out.println("name is "+name+"age is "+age);
	}
	public Person(List list){
		System.out.println("list is "+list);
	}
	public Person(Map map){
		System.out.println("map is "+map);
	}
	
	public static void main(String arg[]){
		System.out.println("i am main method");
	}
}
