package com.online_food.food.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online_food.food.Repositories.CartRepositiory;
import com.online_food.food.Repositories.ItemRepository;
import com.online_food.food.Repositories.RestaurantRepository;
import com.online_food.food.Repositories.UserRepository;
import com.online_food.food.entities.Cart;
import com.online_food.food.entities.Item;
import com.online_food.food.entities.Restaurant;
import com.online_food.food.entities.User;
import com.online_food.food.services.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	ItemRepository itemRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	CartRepositiory cartRepositiory;
	
	@Autowired
	RestaurantRepository restaurantRepository;
	
	@Override
	public Item createItem(Item item) {
		
		return itemRepository.save(item);
	}
	
	@Override
	public List<Item> getAll() {
		// TODO Auto-generated method stub
		return itemRepository.findAll();
	}

	@Override
	public Item findItemById(Long id) {
		// TODO Auto-generated method stub
		return itemRepository.findById(id).get();
	}
	@Override
	public String deleteItem(Long id) {
		// TODO Auto-generated method stub
		Item t= itemRepository.findById(id).get();
		itemRepository.deleteById(id);
		return "Your Record has been deleted!";
	}
	
	@Override
	public Item UpdateItem(Long id, Item item) {
		Item i = itemRepository.findById(id).get();
		i.setItemName(item.getItemName());
		i.setItemPrice(item.getItemPrice());
		return itemRepository.save(i);
	}

	@Override
	public String orderFood(User user) {
		
		List<Cart> cart=user.getCart();
		Long sum=0L;
		for(Cart i: cart) {
			Item  it= itemRepository.findById(i.getItem_id()).get();
//			sum+=it.getItemPrice();
//			i.setTotal(sum);
			i.setTotal(i.getQty()*it.getItemPrice());
			i.setUser(user);
			sum+=i.getTotal();
			cartRepositiory.save(i);
		}
		user.setTotalBill(sum);
		userRepository.save(user);
		return "succesfully order";
	}

	@Override
	public String assignRestaurantToItem(Long resid, Long iId) {
		Restaurant restaurant=restaurantRepository.findById(resid).get();
		Item i = itemRepository.findById(iId).get();
		i.setRestaurant(restaurant);
		itemRepository.save(i);
		return "Restaurant assigned to item";
	}

	
	

}
