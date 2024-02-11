package SpringMVC.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

//Here I had created an parent request mapping inside which all the other 
//request mapping will fall of this class
//we generally use these type of parent-child relationship inside these RequestMapping
//to avoid ambiguity like if there are two @RequestMapping with same name then an ambiguity error
//will be thrown, thus to avoid it.

@RequestMapping("/hello")

public class HelloWorldController2 {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need an controller to process HTML form
	@RequestMapping("/processForm") 
	public String processForm() {
		return "helloWorld"; 
	}
	
}
