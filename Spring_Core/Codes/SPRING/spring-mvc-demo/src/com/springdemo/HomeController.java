package com.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//"@Controller" tells spring that it is an controller and make use of it
//"@Controller" extends from "@Component" scanning

@Controller
public class HomeController {
	
	//we can use any method name instead of "showPage()" method name and 
	//we are mapping url request to this method
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";//this is the name of the view page that we are going to return
		//and this view page is created inside the view folder
	}
	
}
