package com.online_food.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online_food.food.entities.User;
import com.online_food.food.services.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}	
	@PutMapping("/update/{id}")
	public User updateUser(@PathVariable Long id, @RequestBody User user) {
		return userService.updateUser(id, user);
	
	}
	@GetMapping("/show")
	public List<User> getAll(){
		return userService.getAll();
	}

	@GetMapping("/find/{id}")
	public User findById(@PathVariable Long id) {
		return userService.findDetailsById(id);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable Long id) {
		return userService.deleteDetails(id);
	}
}
