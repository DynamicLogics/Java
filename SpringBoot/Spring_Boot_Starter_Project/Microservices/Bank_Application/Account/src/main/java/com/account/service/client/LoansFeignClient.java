package com.account.service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.account.bean.Loans;

@FeignClient("loans")
public interface LoansFeignClient {
	
	@RequestMapping(method=RequestMethod.GET, value="bank/loanDetails", consumes="application/json")
	List<Loans> getLoanDetails(@RequestParam(value="customerId") int Id);
	
}
