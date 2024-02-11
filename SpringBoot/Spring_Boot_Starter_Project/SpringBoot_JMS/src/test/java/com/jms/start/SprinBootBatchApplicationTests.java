package com.jms.start;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.jms.receiver.OrderConfirmationService;
import com.jms.receiver.ReceiveFoodOrder;
import com.jms.sender.Order;
import com.jms.sender.Person;

/*
 * Author: Shubham Ashtaputre
 * 
 */
 
@SpringBootTest
@RunWith(SpringRunner.class)
class SprinBootBatchApplicationTests {
	
	@Autowired
	private JmsTemplate jms;
	
	@MockBean
	private RabbitTemplate rbTemp;
	
	//@Test
	public void shouldSendMessage() throws JMSException{
		Message message = jms.receive("time-queue");
		assertThat(message).isInstanceOf(TextMessage.class);
		System.out.println("Inside test "+((TextMessage) message).getText());
		/*assertThat(((TextMessage) message).getText())
		 .startsWith("current time and date: ");*/
	}	
	
	//receiving the message from sender using destination value i.e. "person-details"
	//@Test
	public void getUserInfo() throws JMSException{
		Person personInfo = (Person) jms.receiveAndConvert("person-details");
		System.out.println(personInfo);
	}
	
	
	//@Test
	public void testResturantOrderingSystem() {
		//call serialized POJO object
		Order ordr = new Order();
		//pass that POJO object to our JMS receiver
		ReceiveFoodOrder order = new ReceiveFoodOrder();
		order.receiveOrder(ordr);
	}
	
	
	
	@Test
	public void testResturantOrderingWithConfirmationSystem() {
		//call serialized POJO object
		Order ordr = new Order();
		ordr.setFoodName("Pizza");
		ordr.setTableNumber(21);
		//pass that POJO object to our JMS receiver
		ReceiveFoodOrder order = new ReceiveFoodOrder();
		//giving order reply back
		OrderConfirmationService confirm = new OrderConfirmationService();
		confirm.orderStatus(order.receiveAndConfirmOrder(ordr));
		
	}
	
	
	
	//@Test
	public void getHelloMessage() {
		System.out.println("in it...");
		verify(rbTemp, Mockito.atLeastOnce())
		.convertAndSend("hello", "Hello how are you?");
	}
	
	
	
	
	
	
}
