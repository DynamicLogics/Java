package IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//loading the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");		
		
		//retrieving bean from spring container
		Coach coach  = context.getBean("myCoach",Coach.class);
		
		//call method on bean
		System.out.println(coach.getDailyWorkout());
			
		//close the context
		context.close();		
		
	}
}
