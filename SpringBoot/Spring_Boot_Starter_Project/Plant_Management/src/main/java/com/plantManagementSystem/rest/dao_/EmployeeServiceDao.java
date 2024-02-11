package com.plantManagementSystem.rest.dao_;

import com.plantManagementSystem.rest.bean.EmployeeDetails;
import com.plantManagementSystem.rest.bean.TwoFactorAuthentication;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


public interface EmployeeServiceDao {
	
	public EmployeeDetails saveEmployeeDetails(EmployeeDetails empObj);
	public EmployeeDetails fetchEmployeeDetails(int empId);
	public String removeEmployee(EmployeeDetails empObj);
	public boolean validateUser(String userName, String password);
	public void createTwoFactorAuthenticationEntry(TwoFactorAuthentication employeeObj);
	public void removeTwoFactorAuthenticationEntry(TwoFactorAuthentication employeeObj);
	public int getUserId(String userName, String password);
	public String setWorkShopOperations(int userId, String operationRequested);
}
