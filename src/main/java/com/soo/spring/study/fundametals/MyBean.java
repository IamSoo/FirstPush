package com.soo.spring.study.fundametals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
	
	@Autowired
	private YourBean yourBean;
	
	
	private String message;
	
	public String getMessage(){
	  return yourBean.getMessage(); 
	}
	
	public MyBean(){
		System.out.println();
		this.message = "My Bean";
	}
	
}
