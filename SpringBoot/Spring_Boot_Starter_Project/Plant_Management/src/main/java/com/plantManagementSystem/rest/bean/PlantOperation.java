package com.plantManagementSystem.rest.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


@Entity
@Table(name="workshop_operations")
public class PlantOperation {
	
	@Column(name="userid",unique = true, nullable = false)
	public int userId;

	@Id
	@Column(name="department")
	public String departmentName;
	
	@Column(name="status")
	public String departmentStatus;

	public PlantOperation() {
		super();
	}

	public PlantOperation(int userId, String departmentName, String departmentStatus) {
		super();
		this.userId = userId;
		this.departmentName = departmentName;
		this.departmentStatus = departmentStatus;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentStatus() {
		return departmentStatus;
	}

	public void setDepartmentStatus(String departmentStatus) {
		this.departmentStatus = departmentStatus;
	}
	
}
