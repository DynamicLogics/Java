package com.plantManagementSystem.rest.endpoint;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plantManagementSystem.rest.bean.LoginValidation;
import com.plantManagementSystem.rest.bean.OTPResult;
import com.plantManagementSystem.rest.bean.OtpStatus;
import com.plantManagementSystem.rest.bean.ValidateUser;
import com.plantManagementSystem.rest.service_.CaptchaService;
import com.plantManagementSystem.rest.service_.EmployeeService;
import com.plantManagementSystem.rest.service_.TwoFactorAuthenticationService;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


@CrossOrigin
@RestController
@RequestMapping("authorization")
public class LoginController {
	
	public static boolean validateCredentials;
	public static boolean validateCaptcha;
	public static int userId;
	public static LoginValidation loginValidator = null;
	public static OtpStatus otpStatus = null;
	public static OTPResult otpResultA = null;
	
	@Autowired
	EmployeeService empService;
	
	@Autowired
	CaptchaService captchaServ;
	
	@Autowired
	TwoFactorAuthenticationService tfaServ;
	
	@PostMapping(path="login",
				 consumes=MediaType.APPLICATION_JSON_VALUE,
				 produces=MediaType.APPLICATION_JSON_VALUE)
	public LoginValidation validateUser(@RequestBody ValidateUser valUser) {
		validateCredentials = empService.validateUserCredentials(valUser.getUserName(), valUser.getPassword());
		validateCaptcha = captchaServ.validateCaptcha(valUser.getCaptchaName(), valUser.getCaptchaValue());
		if(validateCredentials && validateCaptcha == true) {
			loginValidator = new LoginValidation();
			loginValidator.setLoginValid(true);
			return loginValidator;
		}else {
			loginValidator = new LoginValidation();
			loginValidator.setLoginValid(false);
			return loginValidator;
		}
	}
	
	//consumes=MediaType.APPLICATION_JSON_VALUE,
	//@ResponseBody
	@GetMapping(path="sendOtp",
				produces=MediaType.APPLICATION_JSON_VALUE)
	public OtpStatus sendLoginVerificationCode(
			@PathParam(value="userName")String userName,
			@PathParam(value="password")String password) throws Exception {
		userId = empService.getUserId(userName, password);
		if(tfaServ.sendOtpMessage(userId)=="sent") {
			return new OtpStatus("OTP Sent Successfully...",userId);
		}else if(tfaServ.sendOtpMessage(userId)=="error"){
			return new OtpStatus("Error sending OTP message",userId);
		}
		return otpStatus;
	}
	
	@GetMapping(path="verifyOtp",
				produces=MediaType.APPLICATION_JSON_VALUE)
	public OTPResult verifyOtp(@PathParam(value = "otpNumber") int otpNumber,
							   @PathParam(value = "userId") int userId) {
		return new OTPResult(tfaServ.verifyOtpCode(otpNumber,userId));
	}

}
