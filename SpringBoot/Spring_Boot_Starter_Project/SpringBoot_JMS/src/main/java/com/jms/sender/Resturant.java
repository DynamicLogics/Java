package com.jms.sender;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/*
 * Author: Shubham Ashtaputre
 * 
 */
 
@Component
public class Resturant {
	
	final JmsTemplate jms;

	public Resturant(JmsTemplate jms) {
		this.jms = jms;
	}
	
	@Scheduled(fixedRate=1000)
	public void sendOrder() {
		System.out.println("Inside Resturant");
		Order order = new Order("Burger", 20);
		jms.convertAndSend("food_order", order);
	}
		
}
