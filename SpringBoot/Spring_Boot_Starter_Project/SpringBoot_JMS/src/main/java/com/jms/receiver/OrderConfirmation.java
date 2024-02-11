package com.jms.receiver;

import org.springframework.stereotype.Component;

/*
 * Author: Shubham Ashtaputre
 * 
 */
 
@Component
public class OrderConfirmation {
	
	public String orderConfirmation;

	public OrderConfirmation() {
		super();
	}

	public OrderConfirmation(String orderConfirmation) {
		super();
		this.orderConfirmation = orderConfirmation;
	}

	public String getOrderConfirmation() {
		return orderConfirmation;
	}

	public void setOrderConfirmation(String orderConfirmation) {
		this.orderConfirmation = orderConfirmation;
	}
	
}
