package com.online_food.food.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online_food.food.Repositories.UserLoginRepository;
import com.online_food.food.entities.UserLogin;
import com.online_food.food.services.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService{
	@Autowired
	UserLoginRepository userLoginRepository;
	
	@Override
	public String singUp(UserLogin userLogin) {
		
		 userLoginRepository.save(userLogin);
		 return "Successfully LogedIn";
	}

	@Override
	public String Login(String email, String password) {
		UserLogin userLogin = userLoginRepository.findByEmail(email);
		if(userLogin!=null) {
			if(userLogin.getPassword().equals(password))
				return "welcome user";
			else
				return "Invalid Password";
		}
		else
			return "Kindly create Account";
		
	}
	

}
