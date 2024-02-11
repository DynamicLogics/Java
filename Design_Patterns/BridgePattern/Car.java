package com.BridgePattern;

public abstract class Car {
	
	public Product product;
	public String carType;
	
	public Car(Product product, String carType) {
		super();
		this.product = product;
		this.carType = carType;
	}
	
	public abstract void assemble();
	
	public abstract void produceProduct();
	
	public void printDetails(){
		System.out.println("Car: "+carType+", Product: "+product.productName());
	}

}
