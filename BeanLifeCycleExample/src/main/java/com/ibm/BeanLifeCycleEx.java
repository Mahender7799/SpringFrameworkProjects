package com.ibm;

public class BeanLifeCycleEx {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void init() {
		System.out.println(message + " Bean is going throw init");
	}

	public void destroy() {
		System.out.println(message + " Bean Will be destroy now");
	}
}