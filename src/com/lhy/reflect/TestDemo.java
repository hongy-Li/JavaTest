package com.lhy.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import org.junit.Test;

public class TestDemo {
 
	@Test
	public void test1() throws Exception{
			Class clazz=Class.forName("com.lhy.reflect.Person");
			Constructor c=clazz.getConstructor(null);
			Person p=(Person) c.newInstance(null);
		System.out.println(p.age);
	}
	
	@Test
	public void test2() throws Exception{
			Class clazz=Class.forName("com.lhy.reflect.Person");
			Constructor c=clazz.getConstructor(String.class);
			Person p=(Person) c.newInstance("lhy");
		System.out.println(p.age);
	}
	
	@Test
	public void test3() throws Exception{
			Class clazz=Class.forName("com.lhy.reflect.Person");
			Constructor c=clazz.getConstructor(String.class,int.class);
			Person p=(Person) c.newInstance("cch",15);
	}
	
	/**
	 * 反射main 方法
	 * 通过反射调用接收数组的方法的时候就要小心了
	 */
	@Test
	public void test6() throws Exception{
		Class cla=Class.forName("com.lhy.reflect.Person");
		Method method=cla.getMethod("main", String [].class);
		//反射的静态方式是无须传入对象的
//		method.invoke(null, new Object[]{new String [] {"aa","bb"}});
		method.invoke(null, (Object)new String [] {"aa","bb"});
	}
	//*********反射字段**********
	@Test
	public void test7() throws Exception{
		Person p=new Person();
		Class cla=Class.forName("com.lhy.reflect.Person");
		Field f=	cla.getField("name");
//		String name=(String)f.get(p);
		Object value=f.get(p);
		Type type=f.getType();
		if(type.equals(String.class)){
			value=(String)value;
			System.out.println(value);
		}else if(type.equals(int.class)){
			value=(int)value;
			System.out.println(value);
		}
		f.set(p,177);
		System.out.println(p.name);
		
	}
}
