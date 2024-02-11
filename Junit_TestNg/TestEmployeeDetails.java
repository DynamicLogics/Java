package com.testNg.codes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmployeeDetails {
	
	public static EmployeeDetails empDetails = new EmployeeDetails();
	public static EmployeeSalaryCalculation empSalCalculations = new EmployeeSalaryCalculation();
	
	@Test
	public static void testEmployeeYearlySalary() {
		empDetails.setEmployeeName(JUnitConstants.EMPNAME);
		empDetails.setEmployeeAge(JUnitConstants.EMPAGE);
		empDetails.setEmployeeSalary(JUnitConstants.EMPSAL1);
		Double salary = empSalCalculations.getEmployeeYearlySalary(empDetails.getEmployeeSalary());
		System.out.println(salary);
	}

	@Test
	public static void testEmployeeYearlySalaryIncrement() {
		empDetails.setEmployeeName(JUnitConstants.EMPNAME);
		empDetails.setEmployeeAge(JUnitConstants.EMPAGE);
		empDetails.setEmployeeSalary(JUnitConstants.EMPSAL2);
		Double increment = empSalCalculations.getEmployeeYearlySalaryIncrement(empDetails.getEmployeeSalary());
		System.out.println(increment);
	}
	
}
