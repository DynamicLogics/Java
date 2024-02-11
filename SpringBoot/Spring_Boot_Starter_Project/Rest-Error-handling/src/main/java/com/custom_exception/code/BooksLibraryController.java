package com.custom_exception.code;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@CrossOrigin
@RestController
@RequestMapping(value = "/book")
public class BooksLibraryController { //extends RuntimeException
	
	@Autowired
	LibraryServiceIntrfc libService;
	
	/*@Autowired
	CacheManager cacheManager;*/
	
	//@ExceptionHandler(BookIdNotFoundException.class)
	@GetMapping(path="/getBookDetails",
				produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<Map<String,Object>> getBookDetails(@RequestParam(value="bookId") int bookId){
		
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		LibraryBean libServ = this.libService.getBookDetails(bookId);
		//System.out.println("------------>>> "+libServ.getBookId());
		//try {   
				//System.out.println("Inside Try Block");
				map.put("status", HttpStatus.OK.toString());
				map.put("message", "Data-found");
				map.put("data", libServ);
				return new ResponseEntity<>(map, HttpStatus.OK);
		/*}catch (Exception e) {
				System.out.println("Exception Occured");
				map.clear();
				map.put("status", HttpStatus.NOT_FOUND.toString());
				map.put("message", "Book not found");//"Data is not found"
				map.put("data", libServ);
				return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
		}*/
	}
	
	/*@DeleteMapping(path="/clear")
    public ResponseEntity<Void> clearAllCaches() {
        cacheManager.getCacheNames().stream().forEach(cacheName -> cacheManager.getCache(cacheName).clear());
		return null;
    }*/
	
}
