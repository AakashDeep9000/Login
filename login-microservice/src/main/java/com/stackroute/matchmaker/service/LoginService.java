package com.stackroute.matchmaker.service;

import com.stackroute.matchmaker.model.Login;

public interface LoginService {
	
	public Login findByUsername(String username);
}
