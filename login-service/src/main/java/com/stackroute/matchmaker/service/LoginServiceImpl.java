package com.stackroute.matchmaker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.matchmaker.model.Login;
import com.stackroute.matchmaker.repository.LoginRepo;

@Service
public class LoginServiceImpl implements LoginService{

	private LoginRepo loginRepo;
	
	@Autowired
	public LoginServiceImpl(LoginRepo loginRepo) {
		this.loginRepo = loginRepo;
	}
	
	@Override
	public Login findByUsername(String username) {
		return loginRepo.findByUsername(username);
	}

}
