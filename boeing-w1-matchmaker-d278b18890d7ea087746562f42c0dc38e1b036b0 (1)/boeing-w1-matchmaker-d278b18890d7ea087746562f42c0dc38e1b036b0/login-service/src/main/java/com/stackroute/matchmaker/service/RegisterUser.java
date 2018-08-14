package com.stackroute.matchmaker.service;

import com.stackroute.matchmaker.model.Registration;


public interface RegisterUser {
	
	public Registration checkForUserName(String userName);
	public Registration checkForEmail(String email);
	public Registration addUser(Registration registrant);
	
}
