package com.firstspringexample;

/*
 * This is a POJO(Plain Old Java Object)
 */
public class FirstSpringExample {
	
	private String name;
	
	public void setName(String name){
		this.name=name;
	}
	
	public void getName(){
		System.out.println("Your Name :" +name);
	}
}
