package com.aspectOrientedProgramming;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterReturningAdviceExample implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object returnValue, Method method,
		Object[] args, Object target) {
	        System.out.println("After Returning Advive Example");
	        System.out.println("This message is getting displayed after : " + method.getName() + "method");
	}
}