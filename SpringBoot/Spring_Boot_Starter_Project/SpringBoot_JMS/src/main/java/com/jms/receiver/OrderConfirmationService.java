package com.jms.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/*
 * Author: Shubham Ashtaputre
 * 
 */
 
@Component
public class OrderConfirmationService {
	
	@JmsListener(destination="order_confirmation")
	public void orderStatus(OrderConfirmation confirm) {
		System.out.println("OrderConfirmationService");
		System.out.println("[Order Status] "+confirm.getOrderConfirmation());
	}	
	
}
