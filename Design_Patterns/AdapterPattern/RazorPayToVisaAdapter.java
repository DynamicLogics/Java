package com.AdapterPattern;

public class RazorPayToVisaAdapter implements Visa {
	
	public String ownerName;
	public String cardExpiryDate;
	public String cardCvv;
	public String cardNumber;
	public RazorPay razorPay;
	
	public RazorPayToVisaAdapter(RazorPay razorPay) {
		super();
		this.razorPay = razorPay;
		setProp();
	}

	@Override
	public void setDebtCardOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public void setDebtCardExpiryDate(String cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}

	@Override
	public void setDebtCardCvv(String cardCvv) {
		this.cardCvv = cardCvv;
	}

	@Override
	public void setDebtCardCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public String getCardOwnerName() {
		return ownerName;
	}

	@Override
	public String getDebtCardCardExpiryDate() {
		return cardExpiryDate;
	}

	@Override
	public String getDebtCardCvv() {
		return cardCvv;
	}

	@Override
	public String getDebtCardCardNumber() {
		return cardNumber;
	}
	
	public void setProp() {
		setDebtCardOwnerName(this.razorPay.getOwnerName());
		setDebtCardExpiryDate(this.razorPay.getCardExpiryDate());
		setDebtCardCvv(this.razorPay.getCvv());
		setDebtCardCardNumber(this.razorPay.getCardNumber());
	}
	
}
