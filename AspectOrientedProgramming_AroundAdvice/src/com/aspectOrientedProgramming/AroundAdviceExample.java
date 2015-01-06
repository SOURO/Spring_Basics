package com.aspectOrientedProgramming;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdviceExample implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
 
		// same with MethodBeforeAdvice
		System.out.println("Before Advive Example in around advice example");
		System.out.println("This message is getting displayed before : " + methodInvocation.getMethod() + "method");
		try {
			// proceed to original method call
			Object result = methodInvocation.proceed();
 
			// same with AfterReturningAdvice
			System.out.println("After Advive Example in around advice example");
			System.out.println("This message is getting displayed after : " + methodInvocation.getMethod() + "method");
 
			return result;
 
		} catch (IllegalArgumentException e) {
			// same with ThrowsAdvice
			System.out.println("After Throwing Advive Example in around advice example");
			System.out.println("This message is getting displayed after Exception : " + e.toString());
			throw e;
		}
	}
}
