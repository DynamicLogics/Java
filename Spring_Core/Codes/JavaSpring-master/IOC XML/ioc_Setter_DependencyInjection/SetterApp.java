package ioc_Setter_DependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterApp {

	public static void main(String[] args) {
		
		//loading the spring configuration file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext_2.xml");		
				
				//retrieving bean from spring container
				CricketCoach coach  = context.getBean("myCricketCoach",CricketCoach.class);
				
				//call method on bean
				System.out.println(coach.getDailyWorkout());
				
				//call new method for fortune
				System.out.println(coach.getDailyFortune());
				
				//close the context
				context.close();

	}

}
