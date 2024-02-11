package com.AdapterPattern;

public interface RazorPay {
	//setter methods
	public void setOwnerName(String ownerName);
	public void setCardExpiryDate(String cardExpiryDate);
	public void setCvv(String cardCvv);
	public void setCardNumber(String cardNumber);
	//getter methods
	public String getOwnerName();
	public String getCardExpiryDate();
	public String getCvv();
	public String getCardNumber();
}
