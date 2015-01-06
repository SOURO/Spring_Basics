package com.springbeaninheritenceexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Bean.xml");
		Car car1 = (Car) context.getBean("parBeanID");
		Car car2 = (Car) context.getBean("chldBeanID");
		System.out.println(" Car : " + car1.getBrand() + " "
				+ car1.getColour() + " " + car1.getPrice());
		System.out.println(" Car : " + car2.getBrand() + " " + car2.getColour()
				+ " " + car2.getPrice());

	}

}