package com.jms.receiver;

import javax.jms.Destination;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import com.jms.sender.Order;

/*
 * Author: Shubham Ashtaputre
 * 
 */
 
@Component
public class ReceiveFoodOrder {
	
	//The listener receives the Order object, as Spring JMS will take care of receiving and
	//converting the messages
	@JmsListener(destination = "food_order")
	public void receiveOrder(Order order) {
		System.out.println("[Food Order Received] "+order.getFoodName()+" "+order.getTableNumber());
	}	
	
	
	@JmsListener(destination = "food_order")
	//@SendTo annotation indicates that method return value should be converted to message
	//and also we pass the destination to which we want to pass the value
	@SendTo("order_confirmation")
	public OrderConfirmation receiveAndConfirmOrder(Order order) {
		System.out.println("[Food Order Received] "+order.getFoodName()+" "+order.getTableNumber());
		return new OrderConfirmation("order confirmed...");
	}
	
	
	
	
}
