package com.testNg.codes;

import org.testng.annotations.Test;

public class ExpectedExeption {
	
	
	MessageUtil messg = new MessageUtil("Shubham");

	@Test(expectedExceptions = ArithmeticException.class)
	public void testDivideByZero() {
		messg.divideByZero();
	}

	@Test//(expectedExceptions = NullPointerException.class)
	public void testSalutationMessage() {
		messg.salutationMessage();
	}	
	
}
