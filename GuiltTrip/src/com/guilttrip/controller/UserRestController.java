package com.guilttrip.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guilttrip.model.Activity;

@RestController
public class UserRestController {

//accepts data and returns http.status	
	List<Activity> activities = new ArrayList<Activity>();
	
	@RequestMapping(value = "/data", method = RequestMethod.POST)
	public ResponseEntity<?> postActivity(@RequestBody Activity activity) {
		
		activities.add(activity);
		System.out.println(activity);
		return new ResponseEntity <>(activities, HttpStatus.OK);
	}

//Gives user JSON data as return value	
	
	@RequestMapping(value = "/data", method = RequestMethod.GET, produces=MediaType.APPLICATION_PROBLEM_JSON_UTF8_VALUE)
    public List<Activity> showAllActivities() {
       
		return activities;
    }
}





