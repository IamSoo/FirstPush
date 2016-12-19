package com.soo.spring.integration.first;

public class HelloWorld {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init (){
		System.out.println("Inside init function");
	}
	
	public void destroy(){
		System.out.println("Inside destroy function");
	}
}
