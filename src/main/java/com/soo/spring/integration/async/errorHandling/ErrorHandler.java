package com.soo.spring.integration.async.errorHandling;

import org.springframework.integration.MessagingException;
import org.springframework.integration.message.ErrorMessage;

public class ErrorHandler {
	
	public void handleException(MessagingException message ){
		System.out.println("Inside error message handling error");
	}

}
