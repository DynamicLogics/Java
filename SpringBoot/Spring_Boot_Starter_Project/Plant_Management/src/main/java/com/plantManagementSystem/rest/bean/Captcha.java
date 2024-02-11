package com.plantManagementSystem.rest.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/

@Entity
@Table(name="captcha_verify")
public class Captcha {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="rowid")
	int userId;
	
	@Column(name="imagename")
	String imageName;
	
	@Column(name="captchvalue")
	int captchaValue;

	public Captcha() {
		super();
	}

	public Captcha(int userId, String imageName, int captchaValue) {
		super();
		this.userId = userId;
		this.imageName = imageName;
		this.captchaValue = captchaValue;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public int getCaptchaValue() {
		return captchaValue;
	}

	public void setCaptchaValue(int captchaValue) {
		this.captchaValue = captchaValue;
	}

}
