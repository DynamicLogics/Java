package com.card.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.card.bean.Card;
import com.card.service.CardServIntrf;
import com.card.service.CardServiceConfig;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.card.bean.Property;

@CrossOrigin
@RestController
@RequestMapping("/bank")
public class CardController {
	
	@Autowired
	CardServIntrf cardService;
	
	@Autowired
	CardServiceConfig cardServConfig;
	
	@GetMapping(path="/cardDetails",
				produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Card> getCustomerCardDetails(@RequestParam(value="customerId") int Id){
		return this.cardService.getCardDetailsByCustomerid(Id);
	}
	
	@GetMapping(path="/cards/properties")
	public String getPropertyDetails() throws JsonProcessingException {
		
		ObjectWriter oW = new ObjectMapper().writer().withDefaultPrettyPrinter();
		
		Property properties = new Property(cardServConfig.getMsg(), cardServConfig.getBuildVersion(),
				cardServConfig.getMailDetails(), cardServConfig.getActiveBranches());
		
		String jsonString = oW.writeValueAsString(properties);
		
		System.out.println("---> "+jsonString);
		
		return jsonString;
		
	}
	
	
}
