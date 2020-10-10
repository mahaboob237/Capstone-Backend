package com.icin.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icin.dao.UserRepository;
import com.icin.model.User;
import com.icin.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	 
	 @Autowired
	 private UserRepository userRepository;
	 
	 public User findByEmail(String email) {
	        return userRepository.findByMailid(email);
	    }

	@Override
	public User findByUsername(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByFullname(String name) {
		return userRepository.findByFullname(name);
	}
}
