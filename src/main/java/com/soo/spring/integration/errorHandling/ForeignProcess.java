package com.soo.spring.integration.errorHandling;

import org.springframework.stereotype.Component;


public class ForeignProcess {
	public String process(Order order){
		System.out.println("Inside ForeignProcess for :" + order.toString());
		return "SUCCESS";
	}
}
