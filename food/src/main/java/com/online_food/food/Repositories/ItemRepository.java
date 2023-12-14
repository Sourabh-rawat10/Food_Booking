package com.online_food.food.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online_food.food.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
