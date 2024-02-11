package com.account.service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.account.bean.Cards;

@FeignClient("cards")
public interface CardsFeignClient {
	
	@RequestMapping(method=RequestMethod.GET, value="bank/cardDetails", consumes="application/json")
	List<Cards> getCardDetails(@RequestParam(value="customerId") int Id);  
	
}
