package com.online_food.food.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online_food.food.entities.Cart;

public interface CartRepositiory extends JpaRepository<Cart, Long>{

}
