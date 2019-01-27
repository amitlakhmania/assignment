package com.uxpsystems.assignment.dao;

import java.util.List;

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

	@Override
	public void saveUser(User user) {
		
		 jdbcTemplate.update("insert into user values(?,?,?)",
				 new Object[] {
						 user.getId(),user.getUsername(),user.getPassword(),user.getStatus()
				 }
				);
	}

	@Override
	public User findById(Long id) {
		return jdbcTemplate.queryForObject("select * from User where id=?", new Object[] { id },
				new BeanPropertyRowMapper<User>(User.class));
	}
	
	@Override
	public void deleteUser(Long id) {
		jdbcTemplate.queryForObject("delete from User where id=?", new Object[] { id },
				new BeanPropertyRowMapper<User>(User.class));
		
	}

	@Override
	public void updateUser(User user) {
		
		
	}
	
	
}
