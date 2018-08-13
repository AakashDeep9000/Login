package com.stackroute.matchmaker.service;

import org.springframework.stereotype.Service;

import com.stackroute.matchmaker.exception.EmailAlreadyExistsException;
import com.stackroute.matchmaker.exception.UserNameAlreadyExistsException;
import com.stackroute.matchmaker.model.Registration;

@Service
public interface RegisterUser {
	
	public Registration checkForUserName(String userName) throws UserNameAlreadyExistsException;
	public Registration checkForEmail(String email) throws EmailAlreadyExistsException;
	public Registration addUser(Registration registrant);
	
}
