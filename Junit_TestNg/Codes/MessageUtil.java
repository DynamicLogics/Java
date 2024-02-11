package com.testNg.codes;

public class MessageUtil {
	
	private String message;
		// Constructor
		// @param message to be printed
		public MessageUtil(String message) {
		this.message = message;
	}
	
	// prints the message
	public String printMessage() {
		System.out.println(message);
		return message;
	}
	
	// add "Hi!" to the message
	public String salutationMessage() {
		message = "Hi!" + message;
		System.out.println(message);
		return message;
	}
	
	public int divideByZero() {
		int num = 10;
		int num_2 = num/0;
		return num_2;
	}
	
}
