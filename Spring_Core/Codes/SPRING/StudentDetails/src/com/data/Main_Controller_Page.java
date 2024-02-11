package com.data;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main_Controller_Page {

@RequestMapping("/")
public String showHomePage() {
	return "Home";
}
	
}
