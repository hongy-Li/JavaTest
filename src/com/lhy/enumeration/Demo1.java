package com.lhy.enumeration;

import org.junit.Test;

public class Demo1 {

	@Test
	public void test(){
		print(Grade.A);
		print(Grade.B);
		print(Grade.C);
	}
	@Test
	public void test1(){
		print(Grade1.A);
	}
	public void print(Grade g){
		System.out.println(g.toString()+"\r\n"+g.hashCode());
	}
	public void print(Grade1 g){
		System.out.println(g.getValue()+"\r\n"+g.hashCode());
	}
}
class Grade{
	private Grade(){
	};
	public final static Grade A=new Grade();
	public final static Grade B=new Grade();
	public final static Grade C=new Grade();
	public final static Grade D=new Grade();
	
	
}
enum Grade1{
	//枚举类的所有实例必须在类的第一行显式列出。
	A("10"),B("b"),C("c"),D("d");
	private  String value;
	public String getValue() {
		return this.value;
	}
	private Grade1(String value){
		this.value=value;
	};
	
}
enum Color{
	A,B,C,D
}