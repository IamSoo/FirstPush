package com.soo.spring.integration.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldWiredApp {
	
	public static void main(String [] args){
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWordWiredConfiguration.class);
		
		HelloWorldWired hww= (HelloWorldWired)ctx.getBean(HelloWorldWired.class);
		
		hww.setMessage("Hellow World Wired");
		
		System.out.println(hww.getMessage());
	}

}
