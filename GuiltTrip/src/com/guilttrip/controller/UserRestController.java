package com.guilttrip.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guilttrip.model.Activity;

@RestController
public class UserRestController {

//	@RequestMapping(value = "/data/", method = RequestMethod.GET)
//    public ResponseEntity<List<User>> listAllUsers() {
//        List<User> users = userService.findAllUsers();
//        if(users.isEmpty()){
//            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
//    }
   
	@RequestMapping(value = "/data", method = RequestMethod.POST, consumes="application/json")
    public void showAllData(@RequestBody Activity data) {
       
		System.out.println(data);
    }
	
	@RequestMapping(value = "/data", method = RequestMethod.GET, consumes="application/json")
    public Activity updateData() {
       
		return new Activity("Activity", "Motivation", 3);
    }
}
