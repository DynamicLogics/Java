package com.testNg.codes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MessageUtilTest {
	
	public static String message = "Shubham";
	MessageUtil msgUtilObj = new MessageUtil(message);
	
	@Test
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
