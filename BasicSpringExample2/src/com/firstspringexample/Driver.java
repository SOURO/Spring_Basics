package com.firstspringexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		// Bean is getting called here
		FirstSpringExample obj = (FirstSpringExample) context.getBean("BeanID"); 
		obj.getName();	
	}
}
