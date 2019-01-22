package com.uxpsystems.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uxpsystems.assignment.controller.User;
import com.uxpsystems.assignment.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserDao userDao;

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User saveUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> findAllUsers() {
		
		return userDao.getUsers();
	}

	

	

}
