package com.online_food.food.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.online_food.food.entities.UserLogin;

public interface UserLoginRepository extends JpaRepository<UserLogin, Long>{
	@Query(value ="select * from user_login ul where ul.email=(:email)", nativeQuery= true)
	UserLogin findByEmail(String email);
}
 