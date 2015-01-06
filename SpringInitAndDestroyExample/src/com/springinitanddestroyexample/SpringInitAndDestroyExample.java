package com.springinitanddestroyexample;

public class SpringInitAndDestroyExample {
	
	private String name;
	
	public void setName(String name){
		this.name=name;
	}
	
	public void getName(){
		System.out.println("Your Name :" +name);
	}
	public void initExample() throws Exception {
		  System.out.println("Init method is getting called");
	}
	public void destroyExample() throws Exception {
		  System.out.println("Destroy metod is getting called to destroy container");
	}
}
