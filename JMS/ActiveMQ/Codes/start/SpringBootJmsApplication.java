package com.jms.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.jms.receiver.ReceiveFoodOrder;
import com.jms.sender.Order;
import com.jms.sender.Resturant;

/*
 * Author: Shubham Ashtaputre
 * 
 */
//"com.jms.sender","com.jms.receiver"
@SpringBootApplication(scanBasePackages = {"com.rabbitmq.sender"})
@EnableScheduling
public class SpringBootJmsApplication {

	public static void main(String[] args) {
		System.out.println("Inside JMS Application...");
		SpringApplication.run(SpringBootJmsApplication.class, args);
	}

}
