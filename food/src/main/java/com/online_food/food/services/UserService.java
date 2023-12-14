package com.online_food.food.services;

import java.util.List;

import com.online_food.food.entities.User;

public interface UserService {
	User createUser(User user);
	User updateUser( Long id,User user);
	List<User> getAll();
	String deleteDetails(Long id);
	User findDetailsById(Long id);
}
