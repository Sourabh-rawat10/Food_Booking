package com.online_food.food.services;

import java.util.List;
import com.online_food.food.entities.Item;
import com.online_food.food.entities.User;

public interface ItemService {
	Item createItem(Item item);
	Item UpdateItem(Long id, Item item);
	List<Item> getAll();
	Item findItemById(Long id);
	String deleteItem(Long id);
	String assignRestaurantToItem (Long resid, Long iId);
	String orderFood(User user);
}
