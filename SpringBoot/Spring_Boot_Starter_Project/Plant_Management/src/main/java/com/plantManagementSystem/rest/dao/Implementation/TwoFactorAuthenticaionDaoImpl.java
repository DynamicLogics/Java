package com.plantManagementSystem.rest.dao.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.plantManagementSystem.rest.dao_.TwoFactorAuthenticaionDao;
import com.plantManagementSystem.rest.dao_.TwoFactorAuthenticaionServiceDao;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


@Service
public class TwoFactorAuthenticaionDaoImpl implements TwoFactorAuthenticaionServiceDao{

	@Lazy
	@Autowired
	TwoFactorAuthenticaionDao twoFactorAuthenticaionDao;
	
	
	@Override
	public void addnewOtpToExistingUser(int userId,int getRandomValue) {
		twoFactorAuthenticaionDao.insertOtpValue(userId,getRandomValue);
	}

	@Override
	public int getOtpFromExistingUser(int userId) {
		return twoFactorAuthenticaionDao.fetchOtpValue(userId);
	}

	@Override
	public boolean otpCodeVerify(int otpCode,int userId) {
		return twoFactorAuthenticaionDao.matchOtp(otpCode,userId);
	}

}
