package com.soo.spring.integration.firstagain;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class InputResponder implements Responder{
	
	@ServiceActivator
	public String respond(String message){
		System.out.println("Hi message input is : " + message);
		return "Hi message input is : " + message;
	}
	
}
