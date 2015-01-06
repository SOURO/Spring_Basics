package com.pointcut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "Beans.xml" });
 
		//aspectOrientedProgrammingExample emp = (aspectOrientedProgrammingExample) appContext.getBean("employee");
		AspectOrientedProgrammingExample emp = (AspectOrientedProgrammingExample) appContext.getBean("employeeProxy");
		System.out.println("*************************");
		emp.printName();
		System.out.println("*************************");
		emp.printID();
		System.out.println("*************************");
		try {
			emp.printThrowException();
		} catch (Exception e) {
			System.out.println("exception is :" +e);
		}
 
	}
}