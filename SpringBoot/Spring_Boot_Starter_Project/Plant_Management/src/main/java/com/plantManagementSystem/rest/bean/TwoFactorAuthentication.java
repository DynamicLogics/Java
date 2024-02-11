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
@Table(name="two_factor_authentication")
public class TwoFactorAuthentication {
	
	@Id
	@Column(name="employeeid",unique = true)
	int employeeId;
	
	@Column(name="authenticatecode")
	int verificationCode;

	public TwoFactorAuthentication() {
		super();
	}

	public TwoFactorAuthentication(int employeeId, int verificationCode) {
		super();
		this.employeeId = employeeId;
		this.verificationCode = verificationCode;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(int verificationCode) {
		this.verificationCode = verificationCode;
	}
	
}
