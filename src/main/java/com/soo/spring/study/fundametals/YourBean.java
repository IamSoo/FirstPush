package com.soo.spring.study.fundametals;

import org.springframework.stereotype.Component;

@Component
public class YourBean {
	
	private String message = "Your bean ";
	
	public String getMessage(){
		return this.message;
	}
}
