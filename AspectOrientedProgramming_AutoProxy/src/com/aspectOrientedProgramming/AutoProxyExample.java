package com.aspectOrientedProgramming;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class AutoProxyExample implements MethodBeforeAdvice {
	public void before(Method method, Object[] args, Object target){
	        System.out.println("Before Advive Example using auto proxy creation");
	        System.out.println("This message is getting displayed before : " + method.getName() + "method");
	}
}
