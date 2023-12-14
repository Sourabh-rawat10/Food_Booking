package com.online_food.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online_food.food.entities.UserLogin;
import com.online_food.food.services.UserLoginService;

@RestController
@RequestMapping("/api/userLogin")
public class UserLoginController {
	@Autowired
	UserLoginService userLoginService;
	
	@PostMapping("/signup")
	public String singUp(@RequestBody  UserLogin userLogin) {
		return userLoginService.singUp(userLogin);
	}
	
	@GetMapping("/login/{email}/{password}")
	public String Login(@PathVariable String email, @PathVariable String password) {
		return userLoginService.Login(email, password);
	}
}
