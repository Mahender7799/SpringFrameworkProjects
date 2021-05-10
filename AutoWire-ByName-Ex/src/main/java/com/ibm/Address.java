package com.ibm;

public class Address {
	
	private String cirty;
	private String state;
	private String country;
	
	//generate getters and setter
	public String getCirty() {
		return cirty;
	}
	public void setCirty(String cirty) {
		this.cirty = cirty;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Address [cirty=" + cirty + ", state=" + state + ", country=" + country + "]";
	}
	

	
	

}
