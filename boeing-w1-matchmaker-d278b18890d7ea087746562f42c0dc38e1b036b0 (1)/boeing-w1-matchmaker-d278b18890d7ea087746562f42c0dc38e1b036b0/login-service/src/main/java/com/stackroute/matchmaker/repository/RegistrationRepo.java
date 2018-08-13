package com.stackroute.matchmaker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.matchmaker.model.Registration;

@Repository
public interface RegistrationRepo extends CrudRepository<Registration, String>{
	public Registration getUserByUserName(String userName);
	public Registration getUserByEmail(String email);
}
