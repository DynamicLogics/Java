package com.BridgePattern;

public class BridgeMain {

	public static void main(String[] args) {
		
		Product product = new CentralLocking("Central Locking System");
		
		Car car = new BigWheel(product , "BigWheel xz model");
		
		car.produceProduct();
		
		car.assemble();

		car.printDetails();
		
	}

}
