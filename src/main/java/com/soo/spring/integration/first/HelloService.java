package com.soo.spring.integration.first;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class HelloService {
	
  public void sayHello(String name){
	  System.out.println("Ni hao " + name );
  }
}
