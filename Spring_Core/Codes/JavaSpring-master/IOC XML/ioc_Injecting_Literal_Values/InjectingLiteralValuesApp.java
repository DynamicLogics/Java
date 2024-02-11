package ioc_Injecting_Literal_Values;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectingLiteralValuesApp {

	public static void main(String[] args) {
		
		//loading the spring configuration file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext_3.xml");		
				
				//retrieving bean from spring container
				CricketCoach_1 coach1  = context.getBean("myCricketCoach",CricketCoach_1.class);
				
				//call method on bean
				System.out.println(coach1.getDailyWorkout());
				
				//call new method for fortune
				System.out.println(coach1.getDailyFortune());
				
				//call the emailaddress and team name methods
				System.out.println(coach1.getEmailAddress());
				System.out.println(coach1.getTeamName());
				
				//close the context
				context.close();

	}

}
