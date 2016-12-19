package com.soo.spring.integration.firstagain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;

public class SystemA {
	
	public static void main(String args[]){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config2.xml");
		
		
		
		MessageChannel channel = context.getBean("inputChannel",MessageChannel.class);
		MessageChannel ochannel = context.getBean("outputChannel",MessageChannel.class);
		Message<String> msg = MessageBuilder.withPayload("Soonam Kalyan input").build();
		
		channel.send(msg);
		
		ochannel.toString();
		
		
		
	}

}
