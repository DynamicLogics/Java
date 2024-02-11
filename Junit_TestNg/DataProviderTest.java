package com.testNg.codes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@DataProvider(name="userName")
	public static Object[][] primeNumbers() {
		return new Object[][] { {"Shubham"}, {"Ashtaputre"} };
	}
	
	@Test(dataProvider="userName")
	public static void printUserName(String name) {
		System.out.println("UserName Is: "+name);
	}
	
}
