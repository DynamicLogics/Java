package com.plantManagementSystem.rest.bean;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


public class OTPResult {
	
	public boolean otpResult;
	
	public OTPResult(boolean otpVerificationResult) {
		this.otpResult = otpVerificationResult;
	}
	
	public boolean getOtpResult() {
		return this.otpResult;
	}
	
	public void setOtpResult(boolean otpVerificationResult) {
		this.otpResult = otpVerificationResult;
	}
	
}
