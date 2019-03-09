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

import com.guilttrip.model.Task;

@RestController
public class UserRestController {

//accepts data and returns http.status	
	List<Task> tasks = new ArrayList<Task>();
	
	@RequestMapping(value = "/data", method = RequestMethod.POST)
	public ResponseEntity<?> postTask(@RequestBody Task task) {
		
		tasks.add(task);
		System.out.println(task);
		return new ResponseEntity <>(tasks, HttpStatus.OK);
	}

//Gives user JSON data as return value	
	
	@RequestMapping(value = "/data", method = RequestMethod.GET, produces=MediaType.APPLICATION_PROBLEM_JSON_UTF8_VALUE)
    public List<Task> showAllTasks() {
       
		return tasks;
    }
}





