package ioc_Constructor_DependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp_1 {

	public static void main(String[] args) {
		
		//loading the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext_1.xml");		
		
		//retrieving bean from spring container
		Coach_1 coach  = context.getBean("myCoach",Coach_1.class);
		
		//call method on bean
		System.out.println(coach.getDailyWorkout());
		
		//call new method for fortune
		System.out.println(coach.getDailyFortune());
		
		//close the context
		context.close();		
		
	}
}
