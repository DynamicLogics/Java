package com.AdapterPattern;

public class RazorPayImpl implements RazorPay {
	
	String ownerName;
	String cardExpiryDate;
	String cardCvv;
	String cardNumber;
	
	public RazorPayImpl() {
		super();
	}

	@Override
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public void setCardExpiryDate(String cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}

	@Override
	public void setCvv(String cardCvv) {
		this.cardCvv = cardCvv;
	}

	@Override
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public String getOwnerName() {
		return ownerName;
	}

	@Override
	public String getCardExpiryDate() {
		return cardExpiryDate;
	}

	@Override
	public String getCvv() {
		return cardCvv;
	}

	@Override
	public String getCardNumber() {
		return cardNumber;
	}
}
