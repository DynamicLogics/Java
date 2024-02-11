package com.plantManagementSystem.rest.dao_;

import com.plantManagementSystem.rest.bean.EmployeeDetails;

public interface EmployeeServiceDao {
	
	public EmployeeDetails saveEmployeeDetails(EmployeeDetails empObj);
	public EmployeeDetails fetchEmployeeDetails(int empId);
	public String removeEmployee(EmployeeDetails empObj);
}
