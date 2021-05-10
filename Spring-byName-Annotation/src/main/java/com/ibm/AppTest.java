package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest 
{
  public static void main(String[] args) 
  {
	  ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		Employee emp=(Employee) context.getBean("employee");
		System.out.println(emp);
		
	    ((ClassPathXmlApplicationContext) context).close();	
  }
}