package com.plantManagementSystem.rest.bean;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


public class OtpStatus  {
	
	public static String otpMessageStatus;
	public static int userId;

	public OtpStatus() {
	}
	
	public OtpStatus(String otpMessage,int userId) {
		this.otpMessageStatus = otpMessage;
		this.userId = userId;
	}
	
	public String getOtpMessageStatus() {
		return otpMessageStatus;
	}

	public void setOtpMessageStatus(String otpMessageStatus) {
		this.otpMessageStatus = otpMessageStatus;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
