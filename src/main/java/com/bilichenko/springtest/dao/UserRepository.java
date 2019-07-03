package com.bilichenko.springtest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bilichenko.springtest.model.User;

public interface UserRepository extends JpaRepository<User, Long> {}