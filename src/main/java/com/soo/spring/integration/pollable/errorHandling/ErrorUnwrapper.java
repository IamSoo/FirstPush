package com.soo.spring.integration.pollable.errorHandling;

import org.springframework.integration.Message;
import org.springframework.integration.MessagingException;
import org.springframework.integration.message.ErrorMessage;

public class ErrorUnwrapper {
	public Message<?> transform(ErrorMessage errorMessage) {
		System.out.println("Inside transformer");
		return ((MessagingException) errorMessage.getPayload()).getFailedMessage();
	}
}
