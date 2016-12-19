package com.soo.spring.integration.errorHandling;

import org.springframework.stereotype.Component;

public class LocalProcess {
	public String process(Order order){
		System.out.println("Inside LocalProcess for :" + order.toString());
		return "SUCCESS";
	}
}
