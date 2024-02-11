package com.plantManagementSystem.rest.dao_;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


public interface TwoFactorAuthenticaionServiceDao {
	public void addnewOtpToExistingUser(int userId,int getRandomValue);
	public int getOtpFromExistingUser(int userId);	
	public boolean otpCodeVerify(int otpCode,int userId);
}
