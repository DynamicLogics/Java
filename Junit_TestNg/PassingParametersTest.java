package com.testNg.codes;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class PassingParametersTest {

	@Parameters("Shubham")
	@Test
	public void parameterTest(@Optional("SSA") String name) {
		System.out.println("My name is: "+name);
	}
	
}
