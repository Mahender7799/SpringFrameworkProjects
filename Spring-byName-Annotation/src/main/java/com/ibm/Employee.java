package com.ibm;

import org.springframework.beans.factory.annotation.*;

public class Employee
{
	private String fullname;

	@Autowired
	@Qualifier(value="permanentAddress")

	private Address address;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [fullname=" + fullname + ", address=" + address + "]";
	}



}