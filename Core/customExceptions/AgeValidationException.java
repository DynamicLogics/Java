package customExceptions;

public class AgeValidationException extends RuntimeException{
	/*
	 * Author: Shubham Ashtaputre
	 * 1] RuntimeException extends Exception
	 * 
	 */
	public AgeValidationException(String exceptionMessage) {
		super(exceptionMessage);
	}
	
}
