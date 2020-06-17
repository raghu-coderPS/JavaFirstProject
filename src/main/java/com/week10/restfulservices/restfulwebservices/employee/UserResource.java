package com.week10.restfulservices.restfulwebservices.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	@Autowired
	private UserDaoService service;
	@GetMapping("/users")
	public List<UserPOJO> retrieveAllUsers()
	{
		return service.findAll();
		
	}
	@GetMapping("/users/{id}")
	public UserPOJO retrieveOneUser(@PathVariable int id)
	{
		return service.findOneUsingId(id);
	}
	@PostMapping("/users")
	public void createUser(@RequestBody UserPOJO user) {
		UserPOJO savedUser=service.save(user);
	}
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id)
	{
		UserPOJO user=service.deleteUsingId(id);
	}
	

}
