package com.lhy.niuke;

class Value{
    public int i=15;
}
public class Test1{
    public static void main(String argv[]){
        Test1 t=new Test1( );
        t.first( );
        
//    	StringBuffer sb = new StringBuffer("Hello ");
//    	System.out.println("Before change, sb = " + sb);
//    	changeData(sb);
//    	System.out.println("After changeData(n), sb = " + sb); 
        
    }
    public static void changeData(StringBuffer sb) {
    	sb = new StringBuffer("Hi ");
    	sb.append("World!");
    	}
public void first( ){
    int i=5;
    Value v=new Value( );
    v.i=25;
//    second(v,i);
//    System.out.println(v.i);
    for(int j=0;j<7;j++){
    	System.out.println("hah");
    	if(j>3){
//    		continue;
    		return;
    	}
    	System.out.println(j);
    }
}
 
public void second(Value va,int i){
    i = 0;
    va.i = 20;
    Value val = new Value( );
    va = val;
    System.out.println(va.i+" "+i);
   }
}