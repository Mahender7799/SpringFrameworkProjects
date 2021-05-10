package com.ibm;

public class Employee {
	
	private int id;
	private String name;
	private String salary;
	
	
	private Address addressPermanent;
	private Address addressTemporary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Address getAddressPermanent() {
		return addressPermanent;
	}
	public void setAddressPermanent(Address addressPermanent) {
		this.addressPermanent = addressPermanent;
	}
	public Address getAddressTemporary() {
		return addressTemporary;
	}
	public void setAddressTemporary(Address addressTemporary) {
		this.addressTemporary = addressTemporary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", addressPermanent=" + addressPermanent
				+ ", addressTemporary=" + addressTemporary + "]";
	}
	
	

}
