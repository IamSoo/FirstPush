package com.soo.spring.integration.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainHelloWorldApp {

	public static void main (String [] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//		
//		SayHello hello = (SayHello)context.getBean("helloWorld");
//		
//		System.out.println(hello.getMessage());
//		
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorldIntiDestroy");
		helloWorld.getMessage();
		helloWorld.destroy();
		
		
	}
}
