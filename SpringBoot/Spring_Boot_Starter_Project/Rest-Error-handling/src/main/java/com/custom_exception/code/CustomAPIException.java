package com.custom_exception.code;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/*
 * there are two annotation '@RestControllerAdvice' and '@ControllerAdvice' to catch 
 * exceptions at global level, but as we using 'REST API's' we need to use this '@RestControllerAdvice' annotation
 * or else even I had tried with '@ControllerAdvice' and still the code was working fine
 * this '@RestControllerAdvice' acts as interceptor to catch errors and is part of AOP
 */
@RestControllerAdvice
public class CustomAPIException extends ResponseEntityExceptionHandler {
	  
	  //inclusion of this '@ExceptionHandler' annotation is important in exception handling at global level in our code
	  //if we dont include this annotation then our exception wouldn't be get caught and we would not get any error message
	
	  //as seen in below code I had included my 'HttpStatus' in map
	  @ResponseStatus(HttpStatus.NOT_FOUND)
	  @ExceptionHandler(NullPointerException.class)
	  public ResponseEntity <Map<String, Object>> idNotFoundException(NullPointerException exp, WebRequest request) {
		  Map<String, Object> map = new LinkedHashMap<String, Object>();
		  map.put("status", HttpStatus.NOT_FOUND.toString());
		  map.put("message", "Data related to Book is not found");
		  return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
	  }
	  
	  //or I can included my 'HttpStatus' using '@ResponseStatus' annotation
	  @ResponseStatus(HttpStatus.BAD_REQUEST)
	  @ExceptionHandler(MethodArgumentTypeMismatchException.class)
	  public ResponseEntity <Map<String, Object>> dataTypeMismatch(MethodArgumentTypeMismatchException exp, WebRequest request) {
		  Map<String, Object> map = new LinkedHashMap<String, Object>();
		  //map.put("status", HttpStatus.BAD_REQUEST.toString());
		  map.put("message", "Input parameter is of another datatype");
		  return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
	  }
	  
}
