package com.plantManagementSystem.rest.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plantManagementSystem.rest.dao_.CaptchaServiceDao;
import com.plantManagementSystem.rest.service_.CaptchaService;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


@Service
public class CaptchaServiceImpl implements CaptchaService {

	@Autowired
	CaptchaServiceDao capDao;
	
	@Override
	public String loadCaptcha() {
		//get the total captcha image count from database table
		int minCount = 1;  
		int maxCount = capDao.getTotalRowCount();  
		int getRandomValue = (int)(Math.random()*(maxCount-minCount+1)+minCount);  
		//get the random captcha image name from database table
		return capDao.getRandomIamgeName(getRandomValue);
	}

	@Override
	public String loadCaptchaOnRequest() {
		//get the total captcha image count from database table
		int minCount = 1;  
		int maxCount = capDao.getTotalRowCount();  
		int getRandomValue = (int)(Math.random()*(maxCount-minCount+1)+minCount);  
		//get the random captcha image name from database table
		return capDao.getRandomIamgeName(getRandomValue);
	}

	@Override
	public boolean validateCaptcha(String imageName, int value) {
		return capDao.isCaptchaValid(imageName, value);
	}

}
