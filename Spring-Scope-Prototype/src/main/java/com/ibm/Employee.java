package com.ibm;

public class Employee {
	
	private String fullName;
	private String salary;
	
	public Employee() {
		System.out.println("singleton Bean Instantiated," +"Create everytime new Object....!!");
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


}