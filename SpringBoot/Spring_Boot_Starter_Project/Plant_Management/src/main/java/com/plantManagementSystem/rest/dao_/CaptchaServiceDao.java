package com.plantManagementSystem.rest.dao_;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


public interface CaptchaServiceDao {
	public int getTotalRowCount();
	public String getRandomIamgeName(int val);
	public boolean isCaptchaValid(String imageName, int value);
	public boolean addNewOtp(int newNumber);
	public int getExistingOtp(int newNumber);
}
