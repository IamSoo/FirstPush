package com.soo.spring.integration.first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWordWiredConfiguration {
	@Bean
	public HelloWorldWired helloWorldWired(){
		return new HelloWorldWired();
	}
}
