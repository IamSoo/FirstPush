package com.soo.spring.integration.errorHandling;

import java.util.List;

import org.springframework.integration.annotation.Gateway;

public interface IOrderService {
	//@Gateway(requestChannel ="requestChannel")
	public void sendOrder(List<Order> order);

}
