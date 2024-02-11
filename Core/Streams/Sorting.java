package com.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

	/*
	 * Author: Shubham Ashtaputre
	 * Function Usage: If you want to sort your data according to certain pattern say in
	 * 				   ascending or descending order then you can use this 'sorted' method.
	 * 
	 */
	
	public static void main(String[] args) {
		
		List<Employee> employee = Constants.getEmployeeDetails();
		List<Employee> lowestSalary;
		List<Employee> highestSalary;
		List<Employee> names;
		
		//in ascending order low to high
		lowestSalary = employee.stream().sorted(Comparator.comparingInt(Employee::getEmployeeSalary)).
					   collect(Collectors.toList());
		
		//in descending order
		highestSalary = employee.stream().sorted(Comparator.comparingInt(Employee::getEmployeeSalary).reversed()).
					    collect(Collectors.toList());
		
		/*for (Employee employeeSalary : highestSalary) {
			System.out.println(employeeSalary.employeeSalary);
		}*/
		
		//comparing names to get employee names in serial order
		names = employee.stream().sorted(Comparator.comparing(Employee::getEmployeeName)).
				collect(Collectors.toList());
		 
		for (Employee employeeNames : names) {
			System.out.println(employeeNames.employeeName);
		}

	}

}
