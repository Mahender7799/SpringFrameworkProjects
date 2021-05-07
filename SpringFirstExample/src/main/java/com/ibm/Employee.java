package com.ibm;

public class Employee {
	
	private int id;
	private String name;
	private String phonenumber;
	private Address address;
	
	public void display() {
		System.out.println("Details of Employee:"+id+" "+name+" "+phonenumber);
		System.out.println("Address of Employee:"+address);
	}
	
	public Employee(int id,String name,String phonenumber,Address address) {
		super();
		this.id=id;
		this.name=name;
		this.phonenumber=phonenumber;
		this.address=address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phonenumber=" + phonenumber + ", address=" + address + "]";
	}
}