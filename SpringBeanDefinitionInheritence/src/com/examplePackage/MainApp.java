package com.examplePackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main( String[] args )
    {
    	ApplicationContext context = 
			new ClassPathXmlApplicationContext("Beans.xml");
 
    	InheritenceExampleBean cust = (InheritenceExampleBean)context.getBean("CustomerBean");
    	System.out.println(cust.action);
    	System.out.println(cust.type);
    	System.out.println(cust.Country);
 
    }
}