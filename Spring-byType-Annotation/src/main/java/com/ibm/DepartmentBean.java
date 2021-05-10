package com.ibm;

public class DepartmentBean {
	
	private String name;
	
	//getter & setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DepartmentBean [name=" + name + "]";
	}
	
	
	

}
