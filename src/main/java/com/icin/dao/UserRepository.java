package com.icin.dao;

import org.springframework.data.repository.CrudRepository;

import com.icin.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByMailid(String mailid);

	User findByFullname(String name);
	User findByUsername(String name);
}
