package com.lhy.niuke;

import java.util.ArrayList;
import java.util.List;

public class TestDemo {
	public void test() {
		List list = new ArrayList();
		List<A> listA = new ArrayList<>();
		list = listA; // A对 List<B> listB = new ArrayList<>(); // listA = listB;
						// // B错误 List<Object> listObject = new ArrayList<>();
		List<?> list$ = new ArrayList<>();
//		list$ = listObject; // C对 List<D> listD = new ArrayList<>();
		List<? extends B> listExtendsB = new ArrayList<>();
//		listExtendsB = listD; // D对 List<? extends A> listExtendsA = new
								// ArrayList<>(); // listA = listExtendsA; //
								// E错误 // F明显错误 listExtendsA = listExtendsB; //
								// G对 } class A {
	}

	class B extends A {
	}

	class C extends A {
	}

	class D extends B {
	}
}
