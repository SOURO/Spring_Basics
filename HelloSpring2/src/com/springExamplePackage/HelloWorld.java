package com.springExamplePackage;

import org.springframework.beans.factory.annotation.Required;

public class HelloWorld {
	private String message;
	@Required
	public void setMessage(String message){
		this.message = message;
	}
	public void getMessage(){
		System.out.println("your Message :" +message);
	}
}