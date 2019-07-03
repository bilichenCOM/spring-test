package com.bilichenko.springtest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilichenko.springtest.dao.UserRepository;
import com.bilichenko.springtest.model.User;
import com.bilichenko.springtest.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}
}