package com.aspectOrientedProgramming;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class beforeAdviceExample implements MethodBeforeAdvice {
	public void before(Method method, Object[] args, Object target){
	        System.out.println("Before Advive Example");
	        System.out.println("This message is getting displayed before : " + method.getName() + "method");
	}
}
