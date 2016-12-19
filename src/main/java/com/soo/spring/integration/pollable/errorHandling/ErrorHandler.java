package com.soo.spring.integration.pollable.errorHandling;

import org.springframework.integration.MessagingException;
import org.springframework.integration.message.ErrorMessage;

public class ErrorHandler {
	
	public void handleException(ErrorMessage message ){
		System.out.println("Inside sooooooooo ******error message handling error");
	}

}
