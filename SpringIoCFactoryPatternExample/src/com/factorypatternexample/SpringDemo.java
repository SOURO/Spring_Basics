package com.factorypatternexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        context.getBean("userService");
        context.getBean("loginService");
    } 
}
