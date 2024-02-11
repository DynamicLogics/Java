package IoC;

public class MyApp {

	public static void main(String[] args) {
		
		//create the object
		Coach coach = new TennisCoach();

		//use the object
		System.out.println(coach.getDailyWorkout());
		
	}

}
