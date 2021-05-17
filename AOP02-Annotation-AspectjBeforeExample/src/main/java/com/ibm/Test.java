package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Operation e=(Operation) context.getBean("opBean");
		
		System.out.println("sb1 arriving ...");
		e.sb1();
		
		System.out.println();
		System.out.println("sb2 arriving ...");
		e.sb2();
		
		System.out.println();
		System.out.println("sb3 arriving ...");
		e.sb3();
	}
}
