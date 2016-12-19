package com.soo.spring.integration.firstagain;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class OutputResponder {

	@ServiceActivator
	public void respond(){
		System.out.println("The output message input is : " );
	}
	
}
