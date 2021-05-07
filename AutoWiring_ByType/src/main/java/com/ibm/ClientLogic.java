package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Categories category1 = context.getBean("category1", Categories.class);
		category1.show();
		System.out.println("----------------------");
		System.out.println(category1);
		((AbstractApplicationContext) context).close();
	}
}