package com.lhy.niuke;

class Car extends Vehicle
{
    public static void main (String[] args)
    {
        new  Car(). run();
    }
    public final void run()
    {
        System. out. println ("Car");
        Car(1);
    }
    public void Car(int a){
    	
    }
}
class Vehicle
{
    private final void run()
    {
        System. out. println("Vehicle");
    }
}
