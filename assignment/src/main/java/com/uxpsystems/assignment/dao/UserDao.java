package com.uxpsystems.assignment.dao;

import java.util.List;

import com.uxpsystems.assignment.controller.User;

public interface UserDao {
	
 public List<User> getUsers();
 
 public void saveUser(User user);
 
 public User findById(Long id);
 
 public void deleteUser(Long id);
 
 public void updateUser(User user);

}
