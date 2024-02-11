package com.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupBy {

	public static void main(String[] args) {
		
		List<Employee> employeeDetails = Constants.getEmployeeDetails();
		
		HashMap<String,List<Employee>> employeeDetails2 = 
				(HashMap<String, List<Employee>>) 
				employeeDetails.stream().filter(x->x.getEmployeeSalary()>=60000).
				collect(Collectors.groupingBy(Employee::getEmployeeName));
		
		System.out.println(employeeDetails2);
		
		/*for (Employee employee : employeeDetails) {
			System.out.println(employee);
		}*/
		
	}

}
