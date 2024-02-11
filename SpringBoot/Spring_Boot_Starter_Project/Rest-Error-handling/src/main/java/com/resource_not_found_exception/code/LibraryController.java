package com.resource_not_found_exception.code;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/books")
public class LibraryController { //extends RuntimeException
	
	@Autowired
	LibraryServiceIntrfc libService;
	
	//return ResponseEntity.status(HttpStatus.OK).body(map); 
	//consumes = MediaType.APPLICATION_JSON_VALUE,
	@GetMapping(path="/bookNumber",
				produces = MediaType.APPLICATION_JSON_VALUE)
	
	/* 
	 * 1] @RequestParam - get value from the parameter from url 
	 * 
	 * 2] ResponseEntity represents the whole HTTP response: status code, headers, and body. As a result, we can use it to fully 
	 * 	  configure the HTTP response. If we want to use it, we have to return it from the endpoint; Spring takes care of the rest
	 */
	
	ResponseEntity<Map<String,Object>> getBookDetails(@RequestParam(value="bookId") int bookId){
		
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		LibraryBean libServ = this.libService.getBookDetails(bookId);
		
		if(libServ!=null) {
			System.out.println("Inside Try Block");
			map.put("status", HttpStatus.OK.toString());
			map.put("message", "Data-found");
			map.put("data", libServ);
			return new ResponseEntity<>(map, HttpStatus.OK);
		}else {
	//}catch (Exception e) {
			System.out.println("Exception Occured");
			map.clear();
			map.put("status", HttpStatus.NOT_FOUND.toString());
			map.put("message", "Book not found");//"Data is not found"
			map.put("data", libServ);
			return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
	//}
		}
		
	}
	
}
