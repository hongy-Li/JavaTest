package com.lhy.extend;

public abstract class Father {

	public String i="";
	public void say(){
		System.out.println("i am father");
		shou();
	}
	abstract void shou();
	public void print(){
		System.out.println("i is "+i);
	}
	
}
