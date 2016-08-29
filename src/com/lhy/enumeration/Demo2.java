package com.lhy.enumeration;

import org.junit.Test;

public class Demo2 {


	@Test
	public void test1(){
		System.out.println(GradeA.A.name());
		
		System.out.println(GradeA.A.ordinal());
		//判断用户提交的是否是当前的枚举类型
	String str="A";
	GradeA g=GradeA.valueOf(str);
	System.out.println(g.load());
	}
	@Test
	public void test(){
		print(GradeA.A);
	}
	public void print(GradeA g){
		System.out.println(g.getValue()+"\r\n"+g.load()+"\r\n"+g.hashCode());
	}
}

enum GradeA{
	//枚举类的所有实例必须在类的第一行显式列出。
	A("10") {
		@Override
		public String load() {
			// TODO Auto-generated method stub
			return "优";
		}
	},B("b") {
		@Override
		public String load() {
			// TODO Auto-generated method stub
			return "良";
		}
	},C("c") {
		@Override
		public String load() {
			// TODO Auto-generated method stub
			return "中";
		}
	},D("d") {
		@Override
		public String load() {
			// TODO Auto-generated method stub
			return "差";
		}
	};
	private  String value;
	public String getValue() {
		return this.value;
	}
	private GradeA(String value){
		this.value=value;
	};
	public abstract String load();
}
