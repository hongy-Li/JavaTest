package com.lhy.comparelist;

import java.util.Comparator;

public class Sort implements Comparator{  
    public int compare(Object arg0,Object arg1){  
        user user0 = (user)arg0;  
        user user1 = (user)arg1;  
        int flag = user1.getBirthday().compareTo(user0.getBirthday());  
//        int flag = user1.getBirthday()-user0.getBirthday();  
        return flag;  
    }  

}
