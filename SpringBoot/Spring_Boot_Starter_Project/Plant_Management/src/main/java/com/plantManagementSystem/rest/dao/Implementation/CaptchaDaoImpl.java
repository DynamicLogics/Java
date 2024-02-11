package com.plantManagementSystem.rest.dao.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.plantManagementSystem.rest.dao_.CaptchaDao;
import com.plantManagementSystem.rest.dao_.CaptchaServiceDao;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


@Service
public class CaptchaDaoImpl implements CaptchaServiceDao{
	
	@Lazy
	@Autowired
	CaptchaDao cpatchaDao;
	
	public int getTotalRowCount() {
		return cpatchaDao.getTotalCaptchaCount();
	}

	@Override
	public String getRandomIamgeName(int val) {
		return cpatchaDao.getImageName(val);
	}

	@Override
	public boolean isCaptchaValid(String imageName, int value) {
		return cpatchaDao.captchaValidate(imageName,value);
	}

	@Override
	public boolean addNewOtp(int newNumber) {
		return false;
	}

	@Override
	public int getExistingOtp(int newNumber) {
		return 0;
	}
	
}
