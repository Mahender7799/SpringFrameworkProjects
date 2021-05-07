package com.ibm;

public class Address {
	
	//field memeber of .class variable
	
	private String state;
	private String city;
	private String country;
	
	public Address(String state, String city, String country) {
		this.state=state;
		this.city=city;
		this.country=country;
		
	}
	@Override
	public String toString() {
		return "Details of address[state" +state +"  , city="+city+", country="+country  + " ]";
	}

}
