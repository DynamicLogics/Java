package com.jackson.json.code;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
				
		try {
		
			//create an object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			//read json file and map/convert to java POJO: sample-lite.json
			Student theStudent = mapper.readValue(new File("data/sample-lite.json"),Student.class);
			
			//print first and last name
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
