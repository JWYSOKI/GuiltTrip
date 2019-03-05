package com.guilttrip.model;

public class User {
	
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	
	// This is a default construction. It instantiates everything to null.
	//Spring needs this to create a default bean
	public User (){};
	
	//Getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	@Override
	public  String toString() {
		
		String usrString = "This firstName is: " + this.getFirstName();
		
		return usrString;
	}
}
