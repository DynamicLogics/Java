package com.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class List_To_Map {

	/*
	 * Author: Shubham Ashtpautre
	 * Function Usage: If you want to convert your arraylist to map the you can use this 'toMap' method.
	 * 
	 */
	
	public static void main(String[] args) {
		
		List<Employee> employeeDetails = Arrays.asList(
			new Employee("John", 30, 50000),
			new Employee("Mike", 23, 20000),
			new Employee("Tom", 26, 60000),
			new Employee("Tim", 28, 70000),
			new Employee("Jim", 31, 90000),
			new Employee("Michael", 29, 55000)
		);
		
		java.util.Map<String, Integer> empA =  
				employeeDetails.stream().collect
				(Collectors.toMap(Employee::getEmployeeName, Employee::getEmployeeAge));
		
		Iterator ite = empA.keySet().iterator();
		
		while(ite.hasNext()) {
			System.out.println(empA.get(ite.next()));
		}
		
	}

}
