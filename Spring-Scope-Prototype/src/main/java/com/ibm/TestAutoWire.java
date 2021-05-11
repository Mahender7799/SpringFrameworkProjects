package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		Employee emp1 = (Employee) context.getBean("employee");

		emp1.setFullName("raju");
		emp1.setSalary("12000");

		System.out.println(emp1);

		Employee emp2 = (Employee) context.getBean("employee");

		emp1.setFullName("mahi");
		emp1.setSalary("20000");

		System.out.println(emp2);
		
		Employee emp3 = (Employee) context.getBean("employee");

		System.out.println(emp3);

	}

}