package com.springbeanscopesingletonexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args){
		//Bean is getting instantiated here
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		
		// Bean is getting called here
		SpringBeanScopeSingletonExample obj1 = (SpringBeanScopeSingletonExample) context.getBean("BeanID");
		obj1.setName("Souro");
		obj1.getName();
		
		//retrieve it again
		SpringBeanScopeSingletonExample obj2 = (SpringBeanScopeSingletonExample) context.getBean("BeanID"); 
		obj2.getName();
	}
}
