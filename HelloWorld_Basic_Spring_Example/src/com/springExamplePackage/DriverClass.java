package com.springExamplePackage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DriverClass {
	public static void main(String[] args){
		//Bean is getting instantiated here
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		// Bean is getting called here
		HelloWorld obj = (HelloWorld) context.getBean("HelloWorld"); //"HelloWorld" is bean id here from Beans.xml
		obj.getMessage();		
	}
}