package com.lhy.comparelist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class test {
	public static void main(String[] args){  
        List<user> userList = new LinkedList<>();  
        userList.add(new user("吴光雷","男",25,"19871028444444"));  
        userList.add(new user("吴桥","男",22,"1990092387979898"));  
        userList.add(new user("陆晓敏","男",25,"19870728789898"));  
        userList.add(new user("王佳俊","男",23,"19890728797989"));  
        userList.add(new user("秦菁","女",23,"1989121244646"));  
        for(int i=0;i<userList.size();i++){  
            user temp = (user)userList.get(i);  
            System.out.println("姓名:"+temp.getName()+",生日:"+temp.getBirthday());  
        } 
        System.out.println("************************");
        Sort sort = new Sort();  
        Collections.sort(userList,sort);  
        for(int i=0;i<userList.size();i++){  
            user temp = (user)userList.get(i);  
            System.out.println("姓名:"+temp.getName()+",生日:"+temp.getBirthday());  
        }  
    }  
}
