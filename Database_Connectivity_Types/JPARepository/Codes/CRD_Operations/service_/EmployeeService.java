package com.plantManagementSystem.rest.service_;

import com.plantManagementSystem.rest.bean.EmployeeDetails;

public interface EmployeeService {
	
	public EmployeeDetails addNewEmployees(EmployeeDetails empObj);
	public EmployeeDetails viewExistingEmployees(int id);
	public String removeExistingEmployees(EmployeeDetails empObj);
	
}
