package ico_Annotation_Default_Component_Id;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp_1 {

	public static void main(String[] args) {
	
		//read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext_1.xml");
		
		//get the bean from spring container 
		Coach_1 coach = context.getBean("tennisCoach_1",Coach_1.class);
		
		//call the method on bean
		System.out.println(coach.dailyWorkout());
		
		//close the context
		context.close();
		
	}

}
