package com.online_food.food.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online_food.food.Repositories.RestaurantRepository;
import com.online_food.food.Repositories.UserRepository;
import com.online_food.food.entities.Restaurant;
import com.online_food.food.entities.User;
import com.online_food.food.services.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService{
	@Autowired
	RestaurantRepository restaurantRepository;
//	@Autowired
//	UserRepository userRepository;

	@Override
	public Restaurant createRestaurant(Restaurant restaurant) {
		
		return restaurantRepository.save(restaurant);
	}
	
	@Override
	public List<Restaurant> getAll() {
		// TODO Auto-generated method stub
		return restaurantRepository.findAll();
	}

	@Override
	public Restaurant findDetailsById(Long id) {
		// TODO Auto-generated method stub
		return restaurantRepository.findById(id).get();
	}

	@Override
	public String deleteRestaurant(Long id) {
		Restaurant r =restaurantRepository.findById(id).get();
		restaurantRepository.deleteById(id);
		return "Your Record has been delete";
		}

	@Override
	public Restaurant updateRestaurant(Long id,Restaurant restaurant) {
		Restaurant r = restaurantRepository.findById(id).get();
		r.setResLoc(restaurant.getResLoc());
		r.setResName(restaurant.getResName());
		return restaurantRepository.save(r);
 
	}
	
}
