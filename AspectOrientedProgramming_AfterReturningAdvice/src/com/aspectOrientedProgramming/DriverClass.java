package com.aspectOrientedProgramming;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "Beans.xml" });
 
		//aspectOrientedProgrammingExample emp = (aspectOrientedProgrammingExample) appContext.getBean("employee");
		aspectOrientedProgrammingExample emp = (aspectOrientedProgrammingExample) appContext.getBean("employeeProxy");
		System.out.println("*************************");
		emp.printName();
		System.out.println("*************************");
		emp.printID();
		System.out.println("*************************");
	}
}
