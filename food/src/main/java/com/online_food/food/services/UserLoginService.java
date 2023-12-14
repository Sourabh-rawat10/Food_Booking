package com.online_food.food.services;

import com.online_food.food.entities.UserLogin;

public interface UserLoginService {
	String singUp(UserLogin userLogin);
	String Login(String email, String password);
}
