package ioc_DI_Setter_Injection_Autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionApp {

	public static void main(String[] args) {
		
		//read spring config file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext_3.xml");
				
				//get the bean from spring container 
				Coach_3 coach = context.getBean("hockeyCoach",Coach_3.class);
				
				//call the method on bean
				System.out.println(coach.getDailyWorkout());
				
				System.out.println(coach.getFortuneService());
				
				//close the context
				context.close();

	}

}
