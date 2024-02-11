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
//"com.jms.sender","com.jms.receiver", "com.rabbitmq.sender"
@SpringBootApplication(scanBasePackages = {"com.jms.sender","com.jms.receiver"})
//to start the spring scheduler/cron job
@EnableScheduling
public class SpringBootJmsApplication {

	public static void main(String[] args) {
		System.out.println("Inside JMS Application...");
		SpringApplication.run(SpringBootJmsApplication.class, args);
	}

}
