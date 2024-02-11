package com.account.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.account.bean.Account;
import com.account.bean.Cards;
import com.account.bean.CustomerDetails;
import com.account.bean.Loans;
import com.account.bean.Property;
import com.account.service.AccountInterface;
import com.account.service.AccountServiceConfig;
import com.account.service.client.CardsFeignClient;
import com.account.service.client.LoansFeignClient;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@CrossOrigin
@RestController
@RequestMapping(path = "/bank")
public class AccountController {
	//http://localhost:8080/bank/accountDetails?customerId=1
	@Autowired
	AccountInterface serv;
	
	@Autowired
	AccountServiceConfig accountsConfig;
	
	@GetMapping(path="/accountDetails", 
				produces = MediaType.APPLICATION_JSON_VALUE)
	public Account getuserInfo(@RequestParam(value="customerId") int Id) {
		Account acc = this.serv.getCustomerInformation(Id);
		return acc;
	}
	
	@GetMapping(path="/accounts/properties")
	public String getPropertyDetails() throws JsonProcessingException {
		
		ObjectWriter oW = new ObjectMapper().writer().withDefaultPrettyPrinter();
		
		Property properties = new Property(accountsConfig.getMsg(), accountsConfig.getBuildVersion(),
										   accountsConfig.getMailDetails(), accountsConfig.getActiveBranches());
		
		String jsonString = oW.writeValueAsString(properties);
		
		System.out.println("---> "+jsonString);
		
		return jsonString;
		
	}
		
	@Autowired(required = true)
	CardsFeignClient cFc;
	
	@Autowired(required = true)
	LoansFeignClient lFc;
	
	@GetMapping(path="/customerDetails", 
			    produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerDetails customerDetails(@RequestParam(value="customerId") int Id) { 
		
		Account account = this.serv.getCustomerInformation(Id);
		List<Cards> cards = this.cFc.getCardDetails(Id);
		List<Loans> loans = this.lFc.getLoanDetails(Id);
		
		CustomerDetails customerDetails = new CustomerDetails();
		customerDetails.setAccounts(account);
		customerDetails.setCards(cards);
		customerDetails.setLoans(loans);
		
		return customerDetails;
		
	}   
		
}		
		