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

		return userDao.findById(id);
	}

	@Override
	public void saveUser(User user) {

		userDao.saveUser(user);
	}

	@Override
	public void updateUser(User user) {

		userDao.updateUser(user);
	}

	@Override
	public void deleteUser(Long id) {

		userDao.deleteUser(id);

	}

	@Override
	public List<User> findAllUsers() {

		return userDao.getUsers();
	}

}
