package com.lhy.niuke;

class C extends Object
{
    static
    {
        System.out.println("Load B");
    }
    {
    	System.out.println("Load b 构造代码块");
    }
    public C()
    {
        System.out.println("Create B");
    }
}
class A extends C
{
    static
    {
        System.out.println("Load A");
    }
    {
    	System.out.println("Load A 构造代码块");
    }
    public A()
    {
        System.out.println("Create A");
    }
}
 
public class Testclass
{
    public static void main(String[] args)
    {
        new A();
    }
}
