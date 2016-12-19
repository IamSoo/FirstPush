package com.soo.spring.integration.errorHandling;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class ErrorHandlingAppConfiguration {
	
	public static void main(String [] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-errorHandling.xml");
		IOrderService orderService = (IOrderService)context.getBean("firstGateWay") ;
		int orderNumber = 10;
		Order order1 = new Order(1,"101 Soo",new BigDecimal("150"),false);
		order1.setForiegn(false);
		Order order2 = new Order(105,"102 Soo",new BigDecimal("80"),false);
		order2.setForiegn(false);
		Order order3 = new Order(1001,"103 Soo",new BigDecimal("100"),true);
		order3.setForiegn(false);

		List<Order> orderList = new ArrayList<Order>();
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		orderService.sendOrder(orderList);
				
				
		
	}
}
