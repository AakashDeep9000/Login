package com.stackroute.matchmaker.service;


import com.stackroute.matchmaker.exception.EmailAlreadyExistsException;
import com.stackroute.matchmaker.exception.UserNameAlreadyExistsException;
import com.stackroute.matchmaker.model.User;


public interface RegisterUser {
	
	public User checkForUserName(String userName) throws UserNameAlreadyExistsException;
	public User checkForEmail(String email) throws EmailAlreadyExistsException;
	public User addUser(User registrant);
	
}
