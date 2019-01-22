package com.uxpsystems.assignment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uxpsystems.assignment.controller.User;

@Service
public interface UserService {

	User findById(Long id);

	User saveUser();

	void updateUser();

	void deleteUser();

	List<User> findAllUsers();

}
