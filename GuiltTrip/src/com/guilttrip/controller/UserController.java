package com.guilttrip.controller;


import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.guilttrip.model.User;

@Controller
public class UserController {

  @RequestMapping(value = "/register", method = RequestMethod.GET)
  public String showRegister() {
	  System.out.println("im working");
    return "register";
  }
  
  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public String showLogin() {
    return "login";
  }
  
  
  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String showWelcome() {
    return "hello";
  }
  


 
  // ===== back forms that control the submit button (binds data to a model for use elsewhere in app) =======//
  
  @RequestMapping(value = "/register", method = RequestMethod.POST)
  public String addUser(
  @ModelAttribute("user") User user) {
	  return "redirect:/hello";
  }
  
  
  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public String loginUser(
  @ModelAttribute("user") User user) {
	  return "redirect:/hello";
  }
   
}