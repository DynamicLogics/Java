package com.rabbitmq.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MessageConverter;

@Configuration
public class RabbitMQConfiguration {
	
	@Bean
	Queue queueA() {
		/*
		 * name the name of the queue.
		 * Queue(String name, boolean durable)
		 * durable true if we are declaring a durable queue (the queue will survive a server restart)
		 */
		return new Queue("queueA", false);
	}
	
	@Bean
	Queue queueB() {
		/*
		 * name the name of the queue.
		 * Queue(String name, boolean durable)
		 * durable true if we are declaring a durable queue (the queue will survive a server restart)
		 */
		return new Queue("queueB", false);
	}
	
	//here we are using exchange type as Direct
	@Bean
	DirectExchange exchange() {
		return new DirectExchange("exchange.Direct");
	}
	
	@Bean
	Binding binding(Queue queueA,DirectExchange exchange) {
		//here routingA is routing key
		//and I'am binding queueA with exchange
		return BindingBuilder.bind(queueA).to(exchange).with("routingA");
	}
	
	@Bean
	Binding bindingB(Queue queueB,DirectExchange exchange) {
		//here routingB is routing key
		//and I'am binding queueA with exchange
		return BindingBuilder.bind(queueB).to(exchange).with("routingB");
	}
	
	@Bean
	MessageConverter messageConverter() {
		return (MessageConverter) new Jackson2JsonMessageConverter();
	}
	
	@Bean
	RabbitTemplate template(ConnectionFactory factory) {
		RabbitTemplate temp = new RabbitTemplate(factory);
		temp.setMessageConverter((org.springframework.amqp.support.converter.MessageConverter) messageConverter());
		return temp;
	}
	
}
