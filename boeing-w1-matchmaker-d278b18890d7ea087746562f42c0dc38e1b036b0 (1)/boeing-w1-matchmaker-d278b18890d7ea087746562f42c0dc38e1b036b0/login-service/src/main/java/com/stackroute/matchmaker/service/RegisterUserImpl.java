package com.stackroute.matchmaker.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.stackroute.matchmaker.exception.EmailAlreadyExistsException;
import com.stackroute.matchmaker.exception.UserNameAlreadyExistsException;
import com.stackroute.matchmaker.model.Registration;
import com.stackroute.matchmaker.repository.RegistrationRepo;

public class RegisterUserImpl implements RegisterUser{
	
	private RegistrationRepo registrationRepo; 
	
	@Autowired
	public RegisterUserImpl(RegistrationRepo registrationRepo) {
		this.registrationRepo = registrationRepo;
	}

	@Override
	public Registration addUser(Registration registrant) {
		return registrationRepo.save(registrant);		
	}

	@Override
	public Registration checkForUserName(Registration registrant) throws UserNameAlreadyExistsException{
		if(registrationRepo.getUserByUserName(registrant.getUserName())==null)
		return registrant;			
		else 
		throw new UserNameAlreadyExistsException("User name already present");	
	}

	@Override
	public Registration checkForEmail(Registration registrant) throws EmailAlreadyExistsException {
		if(registrationRepo.getUserByEmail(registrant.getEmail())==null)
		return registrant;
		else
		throw new EmailAlreadyExistsException("Email already present");
	}	

}
