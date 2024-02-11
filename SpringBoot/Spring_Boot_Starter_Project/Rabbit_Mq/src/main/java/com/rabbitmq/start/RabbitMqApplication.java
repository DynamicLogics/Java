package com.rabbitmq.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.rabbitmq.configuration","com.rabbitmq.producer"})
public class RabbitMqApplication {

	public static void main(String[] args) {
		System.out.println("Inside RabbitMq Main Class...");
		SpringApplication.run(RabbitMqApplication.class, args);
	}

}
