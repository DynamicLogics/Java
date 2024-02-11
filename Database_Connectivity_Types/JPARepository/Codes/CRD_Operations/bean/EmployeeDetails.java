package com.plantManagementSystem.rest.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="employee")
public class EmployeeDetails implements Serializable{
	
	@Id
	@Column(name="userid")
	private int userId;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="email")
	private String email;
	
	@Column(name="departmentassigned")
	private String departmentAssigned;
	
	@Column(name="address")
	private String address;
	
	@Column(name="nationality")
	private String nationality;
	
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
