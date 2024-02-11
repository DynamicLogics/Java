package com.custom_exception.code;

import org.springframework.stereotype.Service;

@Service
public class LibraryService implements LibraryServiceIntrfc {

	@Override
	public LibraryBean getBookDetails(int bookId) {
		//System.out.println("Inside LibraryService class");
		//try {
			LibraryBean lib = new LibraryBean();
			if(bookId==1) {
				lib.setBookId(bookId);
				lib.setBookName("ABC");
				return lib;
			}else {
				return null;
			}
		/*} catch (Exception e) {
				System.out.println("Inside LibraryService class exception block");
				LibraryBean lib = null;
				return lib;
		}*/
	}
	
}
