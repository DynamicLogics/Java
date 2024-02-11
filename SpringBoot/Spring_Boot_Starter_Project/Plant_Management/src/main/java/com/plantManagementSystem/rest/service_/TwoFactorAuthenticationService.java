package com.plantManagementSystem.rest.service_;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


public interface TwoFactorAuthenticationService {
	public void generateOtp(int userId);
	public String sendOtpMessage(int userId) throws Exception;
	public boolean verifyOtpCode(int otpCode,int userId);
}
