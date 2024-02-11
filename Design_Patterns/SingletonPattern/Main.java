package com.SingletonPattern;

public class Main {

	public static void main(String[] args) {
		
		Singleton singA = Singleton.getInstance();
		System.out.println(singA.hashCode());
		
		Singleton singB = Singleton.getInstance();
		System.out.println(singB.hashCode());
		
	}

}
