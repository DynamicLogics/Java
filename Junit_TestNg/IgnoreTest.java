package com.testNg.codes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IgnoreTest {
	
	public static String message = "Shubham";
	MessageUtil msgUtilObj = new MessageUtil(message);
	
	@Test(enabled=false)
	public static void testPrintMessage() {
		MessageUtil msgUtilObj = new MessageUtil(message);
		Assert.assertEquals(message,msgUtilObj.printMessage());
	}
	
	@Test
	public static void testSalutationMessage() {
		MessageUtil msgUtilObj = new MessageUtil(message);
		Assert.assertEquals("Hi!Shubham",msgUtilObj.salutationMessage());
	}
	
}
