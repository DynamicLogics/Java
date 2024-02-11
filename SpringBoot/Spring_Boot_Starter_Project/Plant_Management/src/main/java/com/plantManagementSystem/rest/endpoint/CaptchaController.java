package com.plantManagementSystem.rest.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.plantManagementSystem.rest.bean.CaptchaImageName;
import com.plantManagementSystem.rest.service_.CaptchaService;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


@CrossOrigin
@RestController
@RequestMapping("captcha")
public class CaptchaController {
	
	@Autowired
	CaptchaService captchaServ;
	
	//@ResponseBody
	@GetMapping(path="captchaOnPageLoad",
				produces=MediaType.APPLICATION_JSON_VALUE)
	public CaptchaImageName viewCaptchaOnPageLoad() {
		CaptchaImageName capName = new CaptchaImageName(captchaServ.loadCaptcha());
		return capName;
	}
	
	//@ResponseBody
	@GetMapping(path="captchaOnRequest")
	public CaptchaImageName viewCaptchaOnRequest() {
		CaptchaImageName capName = new CaptchaImageName(captchaServ.loadCaptcha());
		return capName;
	}
	
}
