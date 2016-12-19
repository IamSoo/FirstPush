package com.soo.spring.study.fundametals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

@Bean
public MyBean getBean(){
	return new MyBean();
}
	
}
