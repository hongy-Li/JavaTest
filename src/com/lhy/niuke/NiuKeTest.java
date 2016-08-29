package com.lhy.niuke;

import org.junit.Test;

public class NiuKeTest {
	
	
	public void add(Byte b) {
		b = b++;
	}
	public void add(int a){
		
	}
	@Test
	public void test9(){
		
		 byte a1 = 2, a2 = 4, a3;
		  short s = 16;
//		 a2 = s;
		 s=a2;
		 
//		  a3 = a1 * a2;
		 
		 
		int ai=1;
		short as=2;
		long al=3;
		al=ai;
		ai=(int) al;
		byte ab=2;
		char ac=3;
//		ac=(char) ab;
//		ab=(byte) ac;
		
		double a=222;
		 float f=42.0f;
		   float f1[]=new float[2];
		   float f2[]=new float[2];
		   float[] f3=f1;
		   long x=42;
		   f1[0]=42.0f;
		   
//		   f=(float) a;
		   a=f;
		   
		   
		   System.out.println(f1==f2);
		   System.out.println(f1[0]==x);
		   System.out.println(f1==f3	);
//		   System.out.println(f2==f1[1]);
	}
	@Test
	public void test8() throws Exception{
		
		final Object obj = new Object();
	    Thread t1 = new Thread() {
	        public void run() {
	            synchronized (obj) {
	                try {
	                	 
	                    obj.wait();
	                    System.out.println("Thread 1 wake up.");
	                } catch (InterruptedException e) {
	                }
	            }
	        }
	    };
	    t1.start();
	    Thread.sleep(1000);//We assume thread 1 must start up within 1 sec.
	    Thread t2 = new Thread() {
	        public void run() {
	            synchronized (obj) {
	                obj.notifyAll();
	                System.out.println("Thread 2 sent notify.");
	            }
	        }
	    };
	    t2.start();
	}
	@Test
	public void test7(){
		
		final String str1="a";
		final String str2="a";
		String str3="aa";
		str1.equals(str2);
		System.out.println((str1+str2)==str3);
	}
	
	@Test
	public void test6(){
		
		int i = 5;
		int j = 10;
		System.out.println(i + ~j);
	}
	@Test
	public void test5(){
		float d1=-0.5f;
		System.out.println("Ceil d1="+Math.ceil(d1));
		System.out.println("floor d1="+Math.floor(d1));
		
		
		
	}
	@Test
	public void test4(){
		int sum=0;
		int i=0;	
		for(i=0;i<10;++i,sum+=i){
			System.out.println("i is "+i+" sum is "+sum);
		}
		System.out.println(" final i is "+i +"sum is "+sum);
		
	}
	@Test
	public void test3(){
		Integer i01=59;
		int i02=59;
		Integer i03=Integer.valueOf(59);
		Integer i04=new Integer(59);
		System.out.println(i01==i02);
		System.out.println(i01==i03);
		System.out.println(i03==i04);
		System.out.println(i02==i04);
		System.out.println(i01==i04);
	}
	@Test
	public void test2(){
		int i=0;
		Integer j = new Integer(0);
		Integer K = new Integer(0);
		//
		System.out.println(i==j);
		System.out.println(K==j);
		System.out.println(j.equals(i));
	}
	@Test
	public void test1(){
		int i=0;
		int j=0;
//		i=i++;
		j=i++;
		j++;
		
		System.out.println(j);
	}
	
	@Test
	public void test() {
		/*
		 * Byte的范围是-128~127  127+1 会越界 变成-128
		 * 
		 * */
		
		Byte a = 127;
		Byte b = 127;
		add(++a);
		System.out.print(a + " ");
		add(b);
		System.out.print(b + "");
	}
}
