package com.testNg.codes;

public class EmployeeSalaryCalculation {
	
	public static double getEmployeeYearlySalary(double monthlySalary) {
		return monthlySalary*12;
	}
	
	public static double getEmployeeYearlySalaryIncrement(double monthlySalary) {
		if(monthlySalary<=10000) {
			return 1230.00;
		}else {
			return 635.667;
		}
	}
	
}
