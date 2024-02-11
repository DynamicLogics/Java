package ioc_DI_Constructor_Injection_Autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionApp {

	public static void main(String[] args) {
		
		//read spring config file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext_3.xml");
				
				//get the bean from spring container 
				Coach_2 coach = context.getBean("baseballCoach",Coach_2.class);
				
				//call the method on bean
				System.out.println(coach.getDailyWorkout());
				
				System.out.println(coach.getDailyFortune());
				
				//close the context
				context.close();

	}

}
