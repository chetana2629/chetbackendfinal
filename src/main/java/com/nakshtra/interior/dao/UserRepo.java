package com.nakshtra.interior.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nakshtra.interior.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	User findByUserName (String userName);
}
