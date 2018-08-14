package com.stackroute.matchmaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchmaker.exception.EmailAlreadyExistsException;
import com.stackroute.matchmaker.exception.UserNameAlreadyExistsException;
import com.stackroute.matchmaker.model.Registration;
import com.stackroute.matchmaker.service.RegisterUserImpl;

@CrossOrigin("*")
@RequestMapping("/api/v1")
@RestController
public class RegistrationController {
	
	private RegisterUserImpl registerUser;
	
	@Autowired
    public RegistrationController(RegisterUserImpl registerUser) {
		this.registerUser = registerUser;
	}

	@PostMapping("/register")
    public ResponseEntity<?> addUser(@RequestBody Registration registrant) {
    	Registration reg = registerUser.addUser(registrant);
		System.out.println(reg);
		return new ResponseEntity<String>("New User Added",HttpStatus.CREATED);   	
    }
	
	@GetMapping("/register/check/userName/{userName}")
	public ResponseEntity<?> checkUserName(@PathVariable("userName") String userName) {
		try
		{
			return new ResponseEntity<Registration>(registerUser.checkForUserName(userName),HttpStatus.OK);
		}
		catch(UserNameAlreadyExistsException e)
		{
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.CONFLICT);
		}
	}
	
	@GetMapping("/register/check/email/{email}")
	public ResponseEntity<?> checkEmail(@PathVariable("email") String email) {
		try
		{
			return new ResponseEntity<Registration>(registerUser.checkForEmail(email),HttpStatus.OK);
		}
		catch(EmailAlreadyExistsException e)
		{
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.CONFLICT);
		}	
	}
    
}   
