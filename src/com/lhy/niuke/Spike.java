package com.lhy.niuke;

public class Spike
{
    public static void main(String[] args)
    {
        Counter a = new Counter();
        System.out.println(a.increment());
        System.out.println(a.anotherIncrement());
        Counter b = new Counter();
        System.out.println(b.increment());
    }
}
class Counter
{
    private static int count = 0;
    public int increment()
    {
//    	count++;
//        return count;
    	return count++;
    }
    public int anotherIncrement()
    {
        return ++count;
    }
}