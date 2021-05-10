package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		Employee employee = ctx.getBean("emp", Employee.class);
		System.out.println(employee);
		((AbstractApplicationContext) ctx).close();
	}
}