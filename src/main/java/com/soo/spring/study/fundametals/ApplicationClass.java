package com.soo.spring.study.fundametals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationClass {
	
	public static void main(String [] args){
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		MyBean bean = context.getBean(MyBean.class);
		System.out.println(bean.getMessage());
	}

}
