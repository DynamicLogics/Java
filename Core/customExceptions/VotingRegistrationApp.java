package customExceptions;

import java.util.Scanner;

public class VotingRegistrationApp {
	
	public static void validateNewVoterDetails(String name, int age) {
		if(age<18) {
			throw new AgeValidationException("age must be atleast 18 years above");
		}else {
			System.out.println("New voter registered successfully");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter voter's name: ");
		String voterName = scan.nextLine();
		System.out.println("Enter voter's age: ");
		int voterAge = Integer.parseInt(scan.nextLine());
		validateNewVoterDetails(voterName,voterAge);
	}

}
