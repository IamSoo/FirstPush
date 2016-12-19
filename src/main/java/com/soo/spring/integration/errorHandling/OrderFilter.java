package com.soo.spring.integration.errorHandling;

import java.math.BigDecimal;

import org.springframework.integration.annotation.Filter;
import org.springframework.stereotype.Component;

//@Component
public class OrderFilter {
	
	public static final String LOW_INT = "100";
	//@Filter
	public boolean doFilter(Order order){
		System.out.println("Doing filter for order :" + order);
		if(order.getOrderAmount().compareTo(new BigDecimal(LOW_INT)) >= 1 ){
			return true;
		}
		return false;
	}

}
