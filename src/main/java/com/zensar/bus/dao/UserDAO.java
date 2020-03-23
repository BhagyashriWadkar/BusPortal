package com.zensar.bus.dao;

import org.springframework.data.repository.CrudRepository;

import com.zensar.bus.model.UserMODL;

public interface UserDAO extends CrudRepository<UserMODL, Integer> {

	UserMODL findByencryptedToken(String enryptedToken);
}
