package com.stream;

import java.util.ArrayList;
import java.util.List;

public class Constants {
	
	public static ArrayList<Integer> numbers;
	
	public static ArrayList<Integer> getNumbers(){
		numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		return numbers;
	}
	
	public static List<Employee> getEmployeeDetails(){
		List<Employee> employeeDetails = new ArrayList<Employee>();
		employeeDetails.add(new Employee("John", 30, 50000));
		employeeDetails.add(new Employee("Mike", 23, 20000));
		employeeDetails.add(new Employee("Tom", 26, 60000));
		employeeDetails.add(new Employee("Tim", 28, 70000));
		employeeDetails.add(new Employee("Jim", 31, 90000));
		employeeDetails.add(new Employee("Michael", 29, 55000));
		return employeeDetails;
	}
	
	public static List<Employee> getRepeatedEmployeeDetails(){
		List<Employee> employeeDetails = new ArrayList<Employee>();
		employeeDetails.add(new Employee("John", 30, 50000));
		employeeDetails.add(new Employee("Mike", 23, 20000));
		employeeDetails.add(new Employee("John", 26, 60000));
		employeeDetails.add(new Employee("Tim", 28, 70000));
		employeeDetails.add(new Employee("Mike", 31, 90000));
		employeeDetails.add(new Employee("Tim", 29, 55000));
		return employeeDetails;
	}
	
	public static List<String> getUniqueValues(){
		List<String> names= new ArrayList<String>();
		names.add("Shubham");
		names.add("Mike");
		names.add("Shubham");
		names.add("Albert");
		names.add("Joseph");
		names.add("Albert");
		return names;
	}
	
	
}
