package com.testNg.codes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	
	//Marks a class or a method as part of the test.
	@Test
	public void testCase1() {
	System.out.println("in test case 1");
	}
	
	//Marks a class or a method as part of the test.
	@Test
	public void testCase2() {
	System.out.println("in test case 2");
	}
	
	//The annotated method will be run before each test method.
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("in beforeMethod");
	}
	
	//The annotated method will be run after each test method.
	@AfterMethod
	public void afterMethod() {
	System.out.println("in afterMethod");
	}
	
	//The annotated method will be run only once before the first test method in
	//the current class is invoked.
	@BeforeClass
	public void beforeClass() {
	System.out.println("in beforeClass");
	}
	
	//The annotated method will be run only once after all the test methods in the
	//current class have been run.
	@AfterClass
	public void afterClass() {
	System.out.println("in afterClass");
	}
	
	//The annotated method will be run before any test method belonging to the
	//classes inside the <test> tag is run.
	@BeforeTest
	public void beforeTest() {
	System.out.println("in beforeTest");
	}
	
	//The annotated method will be run after all the test methods belonging to
	//the classes inside the <test> tag have run.
	@AfterTest
	public void afterTest() {
	System.out.println("in afterTest");
	}
	
	//The annotated method will be run only once before all tests in this suite
	//have run.
	@BeforeSuite
	public void beforeSuite() {
	System.out.println("in beforeSuite");
	}
	
	//The annotated method will be run only once after all tests in this suite have
	//run.
	@AfterSuite
	public void afterSuite() {
	System.out.println("in afterSuite");
	}
	
}
