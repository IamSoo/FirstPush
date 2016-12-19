package com.soo.spring.integration.errorHandling;

import java.util.List;

public class SplittOrder {
	
	public List<Order> split(List<Order> order){
		System.out.println("Inside splitter : " + order);
		return order;
	}

}
