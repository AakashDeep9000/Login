package com.stackroute.matchmaker.model;

import javax.persistence.Entity;

@Entity
public class Registration {

	private String email;
	private String password;
	private String userName;
	
	public Registration() {
		
	}
	
	public Registration(String email, String password, String userName) {
		super();
		this.email = email;
		this.password = password;
		this.userName = userName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String name) {
		this.userName = name;
	}
	@Override
	public String toString() {
		return "Registration [email=" + email + ", password=" + password + ", userName=" + userName + "]";
	}
	
	
}
