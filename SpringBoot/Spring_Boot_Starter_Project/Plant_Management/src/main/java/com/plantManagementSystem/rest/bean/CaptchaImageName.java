package com.plantManagementSystem.rest.bean;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


public class CaptchaImageName {
	
	String imageName;

	public CaptchaImageName(String imageName) {
		super();
		this.imageName = imageName;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
}
