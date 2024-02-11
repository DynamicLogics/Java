package ioc_DI_Field_Injection_Autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FieldInjectionApp {

	public static void main(String[] args) {
		
		//read spring config file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext_4.xml");
				
				//get the bean from spring container 
				Coach_4 coach = context.getBean("rugbyCoach",Coach_4.class);
				
				//call the method on bean
				System.out.println(coach.getDailyWorkout());
				
				System.out.println(coach.getFortuneService());
				
				//close the context
				context.close();

	}

}
