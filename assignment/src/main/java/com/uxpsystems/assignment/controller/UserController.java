package com.uxpsystems.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.uxpsystems.assignment.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value= {"/","/assignment"}, method = RequestMethod.GET)
	public ModelAndView greetUser(ModelMap model) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("assignment");		
		return modelAndView;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/users")
	public List<User> getAllUsers(){
		return userService.findAllUsers();			
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addUser", 
			consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, 
	        produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public void createUser( User user){
		 userService.saveUser(user);		
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/users/{id}")
	public String deleteUsers(@PathVariable(value="id") Long id){
		 userService.deleteUser(id);		
		return "User Scuessfully Deleted";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/users/{id}")
	public User findUserById(@PathVariable(value="id") Long id){
		return userService.findById(id);			
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/user/{id}")
	public void updateUser(@RequestBody User user){
		 userService.updateUser(user);			
	}
	

}
