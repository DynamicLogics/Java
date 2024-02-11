package com.SingletonPattern;

public class Singleton {
	
	private static Singleton sc = null;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(sc==null){
			sc = new Singleton();
		}
		return sc;
	}
	
}
