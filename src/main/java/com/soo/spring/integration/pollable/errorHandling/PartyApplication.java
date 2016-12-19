package com.soo.spring.integration.pollable.errorHandling;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PartyApplication {
	
	public static void main(String [] args) throws Exception{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-errorHandling3.xml");
		Thread.sleep(500);
}

}
