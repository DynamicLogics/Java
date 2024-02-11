package com.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loan.bean.Property;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.loan.bean.Loan;
import com.loan.service.LoanServInter;
import com.loan.service.LoanServiceConfig;

@CrossOrigin
@RestController
@RequestMapping(path="/bank")
public class LoanController {
	
	@Autowired
	LoanServInter loanService;
	
	@Autowired
	LoanServiceConfig loanServConfig;
	
	@GetMapping(path="/loanDetails",
				produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Loan> getUserInfo(@RequestParam(value="customerId") int Id){
		return this.loanService.getCustomerLoanDetails(Id);
	}
	
	@GetMapping(path="/loans/properties")
	public String getPropertyDetails() throws JsonProcessingException {
		
		ObjectWriter oW = new ObjectMapper().writer().withDefaultPrettyPrinter();
		
		Property properties = new Property(loanServConfig.getMsg(), loanServConfig.getBuildVersion(),
				loanServConfig.getMailDetails(), loanServConfig.getActiveBranches());
		
		String jsonString = oW.writeValueAsString(properties);
		
		System.out.println("---> "+jsonString);
		
		return jsonString;
		
	}
	
}
