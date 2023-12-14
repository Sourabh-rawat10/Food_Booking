package com.online_food.food.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online_food.food.entities.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{
	

}
