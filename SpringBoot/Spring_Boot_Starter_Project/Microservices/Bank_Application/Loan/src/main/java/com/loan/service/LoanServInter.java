package com.loan.service;

import java.util.List;

import com.loan.bean.Loan;

public interface LoanServInter {
	
	public List<Loan> getCustomerLoanDetails(int Id);
	
}
