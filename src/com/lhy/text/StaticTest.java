package com.lhy.text;

public class StaticTest {

	
	static String a="static variable";
	
	static {
		System.out.println("static method reference static variable"+a);
	}
	
	public static void get(){
		System.out.println("方法中的 a is "+a );
	}
	public static void get1(){
		System.out.println("get1 is "+a);
	}
}
