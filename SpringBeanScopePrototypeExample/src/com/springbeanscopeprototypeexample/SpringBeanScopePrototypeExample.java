package com.springbeanscopeprototypeexample;

public class SpringBeanScopePrototypeExample {
	
	private String name;
	
	public void setName(String name){
		this.name=name;
	}
	
	public void getName(){
		System.out.println("Your Name :" +name);
	}
}
