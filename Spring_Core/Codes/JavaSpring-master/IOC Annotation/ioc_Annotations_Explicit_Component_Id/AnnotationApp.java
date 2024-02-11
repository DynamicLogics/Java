package ioc_Annotations_Explicit_Component_Id;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {
	
		//read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container 
		Coach coach = context.getBean("thatSillyCoach",Coach.class);
		
		//call the method on bean
		System.out.println(coach.dailyWorkout());
		
		//close the context
		context.close();
		
	}

}
