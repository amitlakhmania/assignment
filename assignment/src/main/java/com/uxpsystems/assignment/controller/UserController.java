package com.uxpsystems.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uxpsystems.assignment.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/assignment")
	public String greetUser() {
		return "Hi Amit, Let's get User details";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/users")
	public List<User> getAllUsers(){
		return userService.findAllUsers();			
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/user")
	public User createUser(@RequestBody User user){
		return userService.saveUser();			
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/users/{id}")
	public String deleteUsers(@PathVariable(value="id") Long id){
		 userService.deleteUser();		
		return "User Scuessfully Deleted";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/user/{id}")
	public User findUserById(@PathVariable(value="id") Long id){
		return userService.findById(id);			
	}
	

}
