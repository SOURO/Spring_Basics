package com.springinitanddestroyexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args){
		//Bean is getting instantiated here
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		// Bean is getting called here
		SpringInitAndDestroyExample obj = (SpringInitAndDestroyExample) context.getBean("BeanID"); 
		obj.getName();	
		((AbstractApplicationContext) context).close();
	}
}
