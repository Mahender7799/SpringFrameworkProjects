package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// bean factory
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");

		Employee employee = (Employee) context.getBean("emp1");

		// employee.display();

		System.out.println("");

		System.out.println(employee);

		Address address1 = (Address) context.getBean("address");

		System.out.println(address1);

		((ClassPathXmlApplicationContext) context).close();

	}
}