package com.AdapterPattern;

public class AdapterMain {

	public static void main(String[] args) {
		
		RazorPay rPay = new RazorPayImpl();
		rPay.setOwnerName("Shubham");
		rPay.setCardNumber("CRD-2345-6789-0098");
		rPay.setCvv("312");
		rPay.setCardExpiryDate("21/07/2023");
		
		Visa vPay = new RazorPayToVisaAdapter(rPay);
		System.out.println(vPay.getCardOwnerName()+"\n");
		System.out.println(vPay.getDebtCardCardNumber()+"\n");
		System.out.println(vPay.getDebtCardCvv()+"\n");
		System.out.println(vPay.getDebtCardCardExpiryDate()+"\n");
		
	}

}
