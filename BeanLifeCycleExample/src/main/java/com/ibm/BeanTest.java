package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");

		BeanLifeCycleExample obj = ctx.getBean("ex", BeanLifeCycleExample.class);

		obj.getMessage();
		((AbstractApplicationContext) ctx).registerShutdownHook();

		((AbstractApplicationContext) ctx).close();

	}

}