package com.aspectOrientedProgramming;

import java.lang.reflect.Method;

import org.springframework.aop.AfterAdvice;

public class AfterFinallyAdviceExample implements AfterAdvice {
	public void afterAdvice(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
	        System.out.println("After Finally Advive Example");
	        System.out.println("This message is getting displayed not depending on exception is present or not");
	}
}