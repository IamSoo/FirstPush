package com.soo.spring.integration.errorHandling;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class Order {
	
	public Order(){
	}
	
	public Order(int orderNo, String orderName, BigDecimal orderAmount,boolean isForeign) {
		super();
		this.orderNo = orderNo;
		this.orderName = orderName;
		this.orderAmount = orderAmount;
		this.foriegn = isForeign;
	}

	public boolean isForiegn() {
		return foriegn;
	}

	public void setForiegn(boolean foriegn) {
		this.foriegn = foriegn;
	}

	public boolean foriegn;
	
	
	

	
	private int orderNo;
	
	private String orderName;
	
	private BigDecimal orderAmount;

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orerName) {
		this.orderName = orerName;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	public String toString(){
		return "Order Number :" + this.orderNo+"Order Name :"+ this.orderName + "Order Amount :" + this.orderAmount + "foreign" + this.foriegn;
	}
}
