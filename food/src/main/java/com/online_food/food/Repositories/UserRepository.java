package com.online_food.food.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online_food.food.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
