package com.stackroute.matchmaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchmaker.model.Login;
import com.stackroute.matchmaker.service.LoginService;

@CrossOrigin("*")
@RequestMapping("/api/v1")
@RestController
public class LoginController {
	
	private LoginService loginUser;
	
	@Autowired
	public LoginController(LoginService loginUser) {
		this.loginUser = loginUser;
	}
	
	@GetMapping("/{username}")
	public Login findByUsername(@PathVariable("username") String username){
		return loginUser.findByUsername(username);
	}
}
