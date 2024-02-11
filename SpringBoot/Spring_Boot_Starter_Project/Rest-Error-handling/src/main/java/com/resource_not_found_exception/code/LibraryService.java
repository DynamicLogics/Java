package com.resource_not_found_exception.code;

import org.springframework.stereotype.Service;

@Service
public class LibraryService implements LibraryServiceIntrfc {

	@Override
	public LibraryBean getBookDetails(int bookId) {
		LibraryBean lib = new LibraryBean();
		lib.setBookId(bookId);
		lib.setBookName("ABC");
		//return lib;
		return null;
	}
	
}
