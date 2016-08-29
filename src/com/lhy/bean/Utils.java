package com.lhy.bean;

public class Utils {

	
	 interface TestInterface{
		void success();
		void failed();
	}
	
	public static void method1(final int a,final int b,final int c){
		
		TestInterface testInteface=new TestInterface(){
			int count;
			@Override
			public void success() {
				
			}

			@Override
			public void failed() {
				System.out.println("count is "+count);
				if(count<c){
					count++;
					System.out.println("method1 interface a is "+a +" b is "+b+" this is "+this);
					method2(a,b,this);
					
				}
			
				
			}
			
		};
		method2(a,b,testInteface);
	}
	public static void method2(int a,int b,TestInterface testInteface){
		System.out.println("method2 :a is "+a+" b is "+b);
		if(a==1){
			testInteface.failed();
		}
		
	}
}
