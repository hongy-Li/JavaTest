package com.lhy.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class Demo {
	@Test
	public void test(){
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
			
		}
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			String value=it.next();
			System.out.println(value);
		}
		
		for(String s:list){
			System.out.println(s);
		}
		
	}
	@Test
	public void test2(){
		//TODO LinkedHashMap 与HashMap
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(3, "cc");
		map.put(1, "aa");
		map.put(2, "bb");
		
		
		Set<Map.Entry<Integer,String>> set=map.entrySet();
		Iterator<Map.Entry<Integer, String>> it=set.iterator();
		while(it.hasNext()){
			Entry<Integer,String> entry=it.next();
			int key=entry.getKey();
			String value=entry.getValue();
			
			System.out.println(key+value);
			
		}
for(Entry<Integer, String> entry:map.entrySet()){
			int key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+value);
		}
		
		
		 
	}
}
