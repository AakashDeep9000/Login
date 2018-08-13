package com.stackroute.matchmaker.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchmaker.model.Registration;

@CrossOrigin("*")
@RequestMapping("/api/v1")
@RestController
public class RegistrationController {
	

    @PostMapping("/register")
    public String post(@RequestBody Registration reg) {
    	System.out.println(reg);
        return "Published successfully";
    }
    
}   
