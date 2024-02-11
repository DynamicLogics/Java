package com.code;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/navigate")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//create a student object
		Student theStudent = new Student();
		
		//add student object to the model
		theModel.addAttribute("student",theStudent);
		
		return "student-form";		
	}
	
	@RequestMapping("/processForm")
	//here we are doing the data-binding so we don't require the Servlet methods to fetch
	//data from the Html form
	public String processForm(@ModelAttribute("student") Student theStudent) {
		return "student-confirmation";
		
	}
	
}
