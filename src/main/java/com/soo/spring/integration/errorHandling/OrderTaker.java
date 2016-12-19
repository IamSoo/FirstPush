package com.soo.spring.integration.errorHandling;

import java.util.List;

public class OrderTaker {
	
	public List<Order> takeOrder(List<Order> order){
		
		System.out.println("We got this order to deliver :" + order.toString());
		
		return order;
	}

}
