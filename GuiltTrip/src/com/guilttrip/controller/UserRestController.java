package com.guilttrip.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.guilttrip.model.Activity;

@RestController
public class UserRestController {
	String json;
//	@RequestMapping(value = "/data/", method = RequestMethod.GET)
//    public ResponseEntity<List<User>> listAllUsers() {
//        List<User> users = userService.findAllUsers();
//        if(users.isEmpty()){
//            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
//    }
	
//This is Jackson. It converts objects to JSON and a JSON to an object. It's also called a mapper. This is a miracle worker!
   public ObjectMapper mapper = new ObjectMapper();
	@RequestMapping(value = "/data", method = RequestMethod.POST, consumes="application/json")
    public void showAllData(@RequestBody Activity data) {
		
		
//Try catch is necessary here because the map throws an exception if it cant make an object into a JSON		
		try {
			json = mapper.writeValueAsString(data);
			System.out.println(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	@RequestMapping(value = "/data", method = RequestMethod.GET, consumes="application/json")
    public Activity updateData() {
       
		return new Activity("Activity", "Motivation", 3);
    }
}
