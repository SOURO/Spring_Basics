package com.springdibyinterfaceexample;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MyServiceApp {
	  public static void main(String...strings) {
	       XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(
	               "myservice.xml"));
	       MyService myService = (MyService) beanFactory.getBean("myService");
	       System.out.println( myService.getText().getTextString());
	   }
}
