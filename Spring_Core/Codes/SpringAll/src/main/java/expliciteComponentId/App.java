package expliciteComponentId;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("expliciteComponentId.xml");
		
		Coach coach = context.getBean("thisCoach",Coach.class);
		
		System.out.println(coach.getDailyPraticeDetails());
		
		context.close();
		
	}

}
