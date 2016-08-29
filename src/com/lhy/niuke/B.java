package com.lhy.niuke;

public class B
{
//    public static B t1 = new B();
  public  static B t2 = new B();
   
    B(){
    	System.out.println("构造函数");
    }
    
    {
        System.out.println("构造块");
    }
    static
    {
        System.out.println("静态块");
    }

    public static void main(String[] args)
    {
        B t = new B();
    }
}