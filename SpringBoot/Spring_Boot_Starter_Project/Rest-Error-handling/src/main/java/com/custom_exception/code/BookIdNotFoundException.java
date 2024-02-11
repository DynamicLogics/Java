package com.custom_exception.code;

public class BookIdNotFoundException extends RuntimeException{
	
	public BookIdNotFoundException(int id) {
		
		 super(String.format("Book with Id %d not found", id));
		 
	}
	
}
