package com.pratice.codes;

public class Employee {
	
	public String employeeName;
	public int employeeAge;
	public int employeeSalary;
	
	public Employee() {
		super();
	}

	public Employee(String employeeName, int employeeAge, int employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
}
