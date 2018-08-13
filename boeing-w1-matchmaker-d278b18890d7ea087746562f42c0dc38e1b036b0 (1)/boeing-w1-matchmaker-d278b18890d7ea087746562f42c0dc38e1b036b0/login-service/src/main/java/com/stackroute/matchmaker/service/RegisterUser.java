package com.stackroute.matchmaker.service;

import org.springframework.stereotype.Service;

import com.stackroute.matchmaker.exception.EmailAlreadyExistsException;
import com.stackroute.matchmaker.exception.UserNameAlreadyExistsException;
import com.stackroute.matchmaker.model.Registration;

@Service
public interface RegisterUser {
	
	public boolean checkForUserName(Registration registrant) throws UserNameAlreadyExistsException;
	public boolean checkForEmail(Registration registrant) throws EmailAlreadyExistsException;
	public Registration addUser(Registration registrant);
	
}
