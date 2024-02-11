package com.loan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.loan.bean.Loan;
import com.loan.dao.LoanDao;

@Service
public class LoanService implements LoanServInter {
	
	@Autowired
	@Lazy
	LoanDao loanDb;
	
	@Override
	public List<Loan> getCustomerLoanDetails(int Id) {
		//System.out.println("Inside Service -------------------- "+Id);
		//List<Loan> loanList = this.loanDb.getCustomerLoanDetails(Id);
		return this.loanDb.findByCustomerIdOrderByStartDtDesc(Id);
	}
	
}
