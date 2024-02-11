package com.jms.sender;

import java.time.LocalDateTime;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/*
 * Author: Shubham Ashtaputre
 * 
 */
 
@Component
public class MessageSender {
	
	 private final JmsTemplate jms;
	 
	 public MessageSender(JmsTemplate jms) {
		 this.jms = jms;
	 }
	
	@Scheduled(fixedRate = 1000)
	public void sendTime() {
		//System.out.println("inside sendTime() method");
		jms.convertAndSend("time-queue", "current time and date: "+LocalDateTime.now());
	}	 
		 
}
