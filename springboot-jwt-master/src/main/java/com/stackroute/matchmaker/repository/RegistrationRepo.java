package com.stackroute.matchmaker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.matchmaker.model.User;

@Repository
public interface RegistrationRepo extends CrudRepository<User, Integer>{
	public User getUserByUsername(String username);
	public User getUserByEmail(String email);
}
