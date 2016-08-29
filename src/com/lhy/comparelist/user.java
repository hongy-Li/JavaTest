package com.lhy.comparelist;

public class user {
	  private String name;  
	    private String sex;  
	    private int age;  
	    private String birthday;  
	      
	    public user(String name,String sex,int age,String birthday){  
	        this.name = name;  
	        this.sex = sex;  
	        this.age = age;  
	        this.birthday = birthday;  
	    }  
	    public String getName() {  
	        return name;  
	    }  
	    public void setName(String name) {  
	        this.name = name;  
	    }  
	    public String getSex() {  
	        return sex;  
	    }  
	    public void setSex(String sex) {  
	        this.sex = sex;  
	    }  
	    public int getAge() {  
	        return age;  
	    }  
	    public void setAge(int age) {  
	        this.age = age;  
	    }  
	    public String getBirthday() {  
	        return birthday;  
	    }  
	    public void setBirthday(String birthday) {  
	        this.birthday = birthday;  
	    }  
	      
}
