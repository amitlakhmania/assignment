package com.uxpsystems.assignment.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uxpsystems.assignment.controller.User;

@Repository
public class UserDaoImpl implements UserDao {
	
  @Autowired
  JdbcTemplate jdbcTemplate;

	@Override
	public List<User> getUsers() {
		
		return jdbcTemplate.query("select * from User",new BeanPropertyRowMapper<User>(User.class));
	}

	public User findById(long id) {
		return jdbcTemplate.queryForObject("select * from User where id=?", new Object[] { id },
				new BeanPropertyRowMapper<User>(User.class));
	}
	
	
}
