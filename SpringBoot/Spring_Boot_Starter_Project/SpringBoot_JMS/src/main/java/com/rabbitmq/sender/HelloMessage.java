package com.rabbitmq.sender;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HelloMessage {
	
	private final RabbitTemplate rabTemp;

	public HelloMessage(RabbitTemplate rabTemp) {
		this.rabTemp = rabTemp;
	}

	@Scheduled(fixedRate = 500)
	public void sendHelloMessage() {
		rabTemp.convertAndSend("hello", "Hello how are you?");
	}
		
		
}
