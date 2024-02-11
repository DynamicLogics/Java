package com.account.bean;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerDetails {
	
	public Account accounts;
	public List<Cards> cards;
	public List<Loans> loans;
	
}
