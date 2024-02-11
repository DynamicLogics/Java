package com.testNg.codes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestAnnotation {
	
	public static String message = "Shubham";
	MessageUtil msgUtilObj = new MessageUtil(message);
	
	@Test
	public static void testPrintMessage() {
		MessageUtil msgUtilObj = new MessageUtil(message);
		Assert.assertEquals(message,msgUtilObj.printMessage());
	}
	
	//below method will get executed after initMessage() method
	@Test(dependsOnMethods = {"initMessage"})
	public static void testSalutationMessage() {
		MessageUtil msgUtilObj = new MessageUtil(message);
		Assert.assertEquals("Hi!Shubham",msgUtilObj.salutationMessage());
	}
	
	@Test
	public void initMessage() {
		System.out.println("Message initiated");
	}
	
}
