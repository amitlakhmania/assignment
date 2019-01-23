package com.uxpsystems.assignment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uxpsystems.assignment.controller.User;

@Service
public interface UserService {

	User findById(Long id);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUser(Long Id);

	List<User> findAllUsers();

}
