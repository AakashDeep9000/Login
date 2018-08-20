package com.stackroute.matchmaker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.matchmaker.model.Login;

@Repository
public interface LoginRepo extends CrudRepository<Login, Integer>{
	Login findByUsername(String username);
}
