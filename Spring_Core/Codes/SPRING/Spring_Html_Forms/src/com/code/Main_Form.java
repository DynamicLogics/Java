package com.code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main_Form {
@RequestMapping("/")
public String mainPage() {
	return "MainPage";
}
	
}
