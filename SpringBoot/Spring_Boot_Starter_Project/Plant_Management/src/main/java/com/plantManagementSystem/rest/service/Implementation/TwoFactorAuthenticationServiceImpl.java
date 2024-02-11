package com.plantManagementSystem.rest.service.Implementation;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plantManagementSystem.rest.dao_.TwoFactorAuthenticaionServiceDao;
import com.plantManagementSystem.rest.service_.TwoFactorAuthenticationService;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


@Service
public class TwoFactorAuthenticationServiceImpl implements TwoFactorAuthenticationService{

	@Autowired
	TwoFactorAuthenticaionServiceDao twoFactorAuthenticaionDao;
	
	@Override
	public void generateOtp(int userId) {
		if(userId!=0) {
		//get the total captcha image count from database table
		int minCount = 1000;  
		int maxCount = 9000;  
		int getRandomValue = (int)(Math.random()*(maxCount-minCount+1)+minCount);  
		twoFactorAuthenticaionDao.addnewOtpToExistingUser(userId,getRandomValue);
	  }
   }
	
	@Override
	public String sendOtpMessage(int userId){
		try {
			//creating new otp value and adding it to associated employee
			generateOtp(userId);
			//here fetching the opt generated in the above line and returning to controller
			/*
			 * get telegram chat id
			 * https://api.telegram.org/{Bot-API-Token}/getUpdates
			 * https://api.telegram.org/bot5414718935:AAFZtJMpNqn2ytsVoNZBr8rKvSvwCYUcouk/getUpdates
			 * 
			 */
			String urlString   = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s";
			String apiToken    = "5414718935:AAFZtJMpNqn2ytsVoNZBr8rKvSvwCYUcouk";
			String chatId      = "-1001700109994";
			String optCode     = String.valueOf(twoFactorAuthenticaionDao.getOtpFromExistingUser(userId));
			String otpSuccess  = "Hi "+String.valueOf(userId)+", please use "+optCode+" as your Login OTP.";
			urlString          = String.format(urlString, apiToken, chatId, otpSuccess);
			URL url 		   = new URL(urlString);
			URLConnection conn = url.openConnection();
			InputStream is 	   = new BufferedInputStream(conn.getInputStream());
			//returning success message
			return "sent";
		}catch (Exception e) {
			//e.printStackTrace();
			return "error";
		}
	}

	@Override
	public boolean verifyOtpCode(int otpCode,int userId) {
		return twoFactorAuthenticaionDao.otpCodeVerify(otpCode,userId);
	}
	
}	
