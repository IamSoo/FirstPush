package com.soo.spring.integration.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;

public class HelloApp {
	
	public static void main (String [] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		MessageChannel channel = context.getBean("inputChannel",MessageChannel.class);
		
		Message<String> msg = MessageBuilder.withPayload("Soonam Kalyan").build();
		
		channel.send(msg);
	}

}
