package com.plantManagementSystem.rest.service_;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


public interface CaptchaService {
	public String loadCaptcha();
	public String loadCaptchaOnRequest();
	public boolean validateCaptcha(String imageName, int value);
}
