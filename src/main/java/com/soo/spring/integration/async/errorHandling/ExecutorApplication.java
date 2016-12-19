package com.soo.spring.integration.async.errorHandling;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecutorApplication {
	
	public static void main (String [] args){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-errorHandling2.xml");
		
		ErrorHandlingGateway bean =  (ErrorHandlingGateway)ctx.getBean("errorHandlingGateway");
		
		for (int i = 0 ; i < 3 ; i ++){
		String [] array = {"soonam","kalyan","panda","living",null,"China"};
		Arrays.asList(array);
		bean.sendMessge(Arrays.asList(array));
		}
		
	}

}
