package com.jms.sender;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/*
 * Author: Shubham Ashtaputre
 * 
 */
 
@Component
public class PersonInfoSend {
	
	private final JmsTemplate jms;
	private Person personinfo;
	
	
	public PersonInfoSend(JmsTemplate jms) {
		 this.jms = jms;
	}
	
	@Scheduled(fixedRate = 1000)
	public void sendPersonInfomation() {
		System.out.println("Inside PersonInfoSend");
		personinfo = new Person();
		personinfo.setName("Shubham Ashtaputre");
		personinfo.setAge(27);
		jms.convertAndSend("person-details", personinfo);
	}
	
}
