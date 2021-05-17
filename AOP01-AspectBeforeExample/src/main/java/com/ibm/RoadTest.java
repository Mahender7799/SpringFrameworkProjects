package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RoadTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Road road=(Road) context.getBean("roadBean");
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println(" Sb1 arriving ... ");
		road.sb1();
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println(" Sb2 arriving ... ");
		road.sb2();
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println(" Sb3 arriving ... ");
		road.sb3();
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println(" M1 arriving ... ");
		road.m1();
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println(" M2 arriving ... ");
		road.m2();
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println(" M3 arriving ... ");
		road.m3();
	}
}
