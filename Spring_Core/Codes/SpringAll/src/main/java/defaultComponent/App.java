package defaultComponent;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		//reading the xml file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("defaultComponent.xml");
		
		Coach coach = context.getBean("cricketCoach",Coach.class);
		
		System.out.println(coach.getDailyRoutines());
		
		context.close();
		
	}

}
