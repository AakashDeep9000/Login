package com.stackroute.matchmaker.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.matchmaker.model.Registration;

@Repository
public interface RegistrationRepo extends CrudRepository<Registration, String>{
	public Optional<Registration> getUserByUserName(String userName);
	public Optional<Registration> getUserByEmail(String email);
}
