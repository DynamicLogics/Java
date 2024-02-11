package com.plantManagementSystem.rest.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


@ApiModel(description = "Details about an Employee")
@Entity
@Table(name="employee")
public class EmployeeDetails implements Serializable{
	
	@ApiModelProperty(notes = "Employee unique ID")
	@Id
	@Column(name="userid",unique = true, nullable = false)
	private int userId;
	
	@ApiModelProperty(notes = "Employee Name")
	@Column(name="username")
	private String userName;
	
	@ApiModelProperty(notes = "Employee Password")
	@Column(name="password")
	private String password;
	
	@ApiModelProperty(notes = "Employee Date Of Birth")
	@Column(name="dob")
	private String dob;
	
	@ApiModelProperty(notes = "Employee Email")
	@Column(name="email")
	private String email;
	
	@ApiModelProperty(notes = "Employee Assigned Department")
	@Column(name="departmentassigned")
	private String departmentAssigned;
	
	@ApiModelProperty(notes = "Employee Address")
	@Column(name="address")
	private String address;
	
	@ApiModelProperty(notes = "Employee Nationality")
	@Column(name="nationality")
	private String nationality;
	
	@ApiModelProperty(notes = "Employee Permissions")
	@Column(name="permissions")
	private String permissions;
	
	public EmployeeDetails() {
		super();
	}

	public EmployeeDetails(String userName, String password, String dob, String email, String departmentAssigned,
			int userId, String address, String nationality, String permissions) {
		super();
		this.userName = userName;
		this.password = password;
		this.dob = dob;
		this.email = email;
		this.departmentAssigned = departmentAssigned;
		this.userId = userId;
		this.address = address;
		this.nationality = nationality;
		this.permissions = permissions;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartmentAssigned() {
		return departmentAssigned;
	}

	public void setDepartmentAssigned(String departmentAssigned) {
		this.departmentAssigned = departmentAssigned;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPermissions() {
		return permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [userId=" + userId + ", userName=" + userName + ", password=" + password + ", dob="
				+ dob + ", email=" + email + ", departmentAssigned=" + departmentAssigned + ", address=" + address
				+ ", nationality=" + nationality + ", permissions=" + permissions + "]";
	}
	
}
