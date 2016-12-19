package com.soo.spring.integration.first;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class PrintService {
	
	@ServiceActivator
	public void printString(String value){
		System.out.println("Received from output channel :" + value);
	}

}
