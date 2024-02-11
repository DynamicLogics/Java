package com.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.account.bean.Account;
import com.account.dao.AccountDao;

@Service
public class AccountService implements AccountInterface{
	
	@Autowired
	@Lazy
	AccountDao getCustomerInfo;
	
	public Account getCustomerInformation(int Id) {
		/*System.out.println("Customer Id -------------------------- "+Id);
		Account accData = this.getCustomerInfo.findByCustomerId(Id);
		if(accData!=null) {
			return accData;
		}else {
			return null;
		}*/
		return this.getCustomerInfo.findByCustomerId(Id);
	}
	
}
