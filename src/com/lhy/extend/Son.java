package com.lhy.extend;

import org.junit.Test;

public class Son extends Father {
	@Test
	@Override
	public void say() {
		super.say();
		i="3";
		print();
	}

	@Override
	void shou() {
	}
	
	

//	@Override
//	static void shou() {
//		System.out.println("i am son shou");
//	}
}
