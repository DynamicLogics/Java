package com.plantManagementSystem.rest.bean;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/

public class ValidateUser {
	
	public String userName;
	public String password;
	public String captchaName;
	public int captchaValue;
	
	public ValidateUser() {
		super();
	}

	public ValidateUser(String userName, String password, String captchaName, int captchaValue) {
		super();
		this.userName = userName;
		this.password = password;
		this.captchaName = captchaName;
		this.captchaValue = captchaValue;
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

	public String getCaptchaName() {
		return captchaName;
	}

	public void setCaptchaName(String captchaName) {
		this.captchaName = captchaName;
	}

	public int getCaptchaValue() {
		return captchaValue;
	}

	public void setCaptchaValue(int captchaValue) {
		this.captchaValue = captchaValue;
	}
	
}
