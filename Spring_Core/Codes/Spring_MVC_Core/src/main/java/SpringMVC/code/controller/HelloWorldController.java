package SpringMVC.code.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HelloWorldController {
	
	//need an controller to show initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need an controller to process HTML form
	@RequestMapping("/processForm") 
	public String processForm() {
		return "helloWorld"; 
	}
	
	//new method to read form data and add data to model
	@RequestMapping("/processFormV2")
	public String processFormV2(HttpServletRequest request, Model model) {

		//read the request parameter from HTML form
		String theName = request.getParameter("studentName");
		
		//convert that data to upper case
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Yo! " + theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloWorld"; 
		
	}
	
	//Here, @RequestParam will bond the attribute names from the front end with back end and 
	//we assign an data-type to it so that we don't need to use the 'HttpServletRequest'
	
	@RequestMapping("/processFormV3")
	public String processFormV3(
			@RequestParam("studentName") String thisName, 
			Model model) {
				
		thisName = thisName.toUpperCase();
		
		String result2 = "V3, "+thisName;
		
		model.addAttribute("message", result2);
		
		return "helloWorld"; 
	}
	
}

