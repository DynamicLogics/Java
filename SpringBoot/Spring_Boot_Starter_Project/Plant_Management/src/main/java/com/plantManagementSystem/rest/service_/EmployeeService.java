package com.plantManagementSystem.rest.service_;

import com.plantManagementSystem.rest.bean.EmployeeDetails;
import com.plantManagementSystem.rest.bean.PlantOperation;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


public interface EmployeeService {
	
	public EmployeeDetails addNewEmployees(EmployeeDetails empObj);
	public EmployeeDetails viewExistingEmployees(int id);
	public String removeExistingEmployees(EmployeeDetails empObj);
	public boolean validateUserCredentials(String userName, String password);
	public int getUserId(String userName, String password);
	public EmployeeDetails generateEmployeeRecord(int userId);
	public String newWorkshopOperations(PlantOperation plantObj);
}
