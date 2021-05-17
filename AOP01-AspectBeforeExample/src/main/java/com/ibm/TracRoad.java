package com.ibm;

import org.aspectj.lang.JoinPoint;

public class TracRoad {
	public void myadvice(JoinPoint jp) {
		System.out.println("Speed breaker please slow down");
		//Object obj=jp.getSignature();
		//System.out.println("Method Signature : "+jp.getSignature());
		//System.out.println("My advice to rice the speed as u cross the speed breker");
	}
}
