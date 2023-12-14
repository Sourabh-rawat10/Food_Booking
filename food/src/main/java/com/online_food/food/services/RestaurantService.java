package com.online_food.food.services;

import java.util.List;

import com.online_food.food.entities.Restaurant;
import com.online_food.food.entities.User;

public interface RestaurantService {
	Restaurant createRestaurant(Restaurant restaurant);
	List<Restaurant> getAll();
	String deleteRestaurant(Long id);
	Restaurant findDetailsById(Long id);
	Restaurant updateRestaurant( Long id, Restaurant restaurant);
	
	
}
