package com.online_food.food.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online_food.food.Repositories.UserRepository;
import com.online_food.food.entities.User;
import com.online_food.food.services.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;

	@Override
	public User createUser(User user) {
		
		return userRepository.save(user);
	}
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	
	@Override
	public User findDetailsById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public String deleteDetails(Long id) {
		// TODO Auto-generated method stub
		User p=userRepository.findById(id).get();
		userRepository.deleteById(id);
		return "Your Record has been deleted";
	}


	@Override
	public User updateUser(Long id, User user) {
		User u = userRepository.findById(id).get();
		u.setName(user.getName());
		u.setContactNo(user.getContactNo());
		u.setEmailId(user.getEmailId());
		u.setGender(user.getGender());
		return userRepository.save(u);
		
	}

}
