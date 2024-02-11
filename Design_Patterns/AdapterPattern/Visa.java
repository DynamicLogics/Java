package com.AdapterPattern;

public interface Visa {
	//setter methods
	public void setDebtCardOwnerName(String ownerName);
	public void setDebtCardExpiryDate(String cardExpiryDate);
	public void setDebtCardCvv(String cardCvv);
	public void setDebtCardCardNumber(String cardNumber);
	//getter methods
	public String getCardOwnerName();
	public String getDebtCardCardExpiryDate();
	public String getDebtCardCvv();
	public String getDebtCardCardNumber();
}
