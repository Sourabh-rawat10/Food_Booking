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

import com.online_food.food.entities.Restaurant;
import com.online_food.food.services.RestaurantService;

@RestController
@RequestMapping("/api/res")
public class RestaurantController {
	@Autowired
	RestaurantService restaurantService;
	
	@PostMapping("/create")
	public Restaurant createResturant(@RequestBody Restaurant restaurant) {
		return restaurantService.createRestaurant(restaurant);
	}
	
	@GetMapping("/show")
	public List<Restaurant> getAll(){
		return restaurantService.getAll();
	}

	@GetMapping("/find/{id}")
	public Restaurant findById(@PathVariable Long id) {
		return restaurantService.findDetailsById(id);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable Long id) {
		return restaurantService.deleteRestaurant(id);
	}

	@PutMapping("/update/{id}")
	public Restaurant updateRestaurant(@PathVariable Long id, @RequestBody Restaurant restaurant) {
		return restaurantService.updateRestaurant(id,restaurant);
	}
}
