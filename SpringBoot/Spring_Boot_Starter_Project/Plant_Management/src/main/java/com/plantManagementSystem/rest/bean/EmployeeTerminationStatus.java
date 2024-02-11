package com.plantManagementSystem.rest.bean;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


public class EmployeeTerminationStatus {
	
	public String terminationStatus;
	
	public EmployeeTerminationStatus() {
		super();
	}

	public EmployeeTerminationStatus(String terminationStatus) {
		super();
		this.terminationStatus = terminationStatus;
	}

	public String getTerminationStatus() {
		return terminationStatus;
	}

	public void setTerminationStatus(String terminationStatus) {
		this.terminationStatus = terminationStatus;
	}
	
}
