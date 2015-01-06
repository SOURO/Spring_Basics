package com.aspectOrientedProgramming;

import org.springframework.aop.ThrowsAdvice;

public class AfterThrowingAdviceExample implements ThrowsAdvice {
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("After Throwing Advive Example");
        System.out.println("This message is getting displayed after Exception : " + e.toString());
	}
	
}
