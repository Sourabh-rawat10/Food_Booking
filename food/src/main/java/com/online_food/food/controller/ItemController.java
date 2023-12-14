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

import com.online_food.food.entities.Item;
import com.online_food.food.entities.User;
import com.online_food.food.services.ItemService;

@RestController
@RequestMapping("/api/item")
public class ItemController {
	@Autowired
	ItemService itemService;
	
	@PostMapping("/create")
	public Item createItem(@RequestBody Item item) {
		return itemService.createItem(item);
	}
	
	@GetMapping("/show")
	public List<Item> getAll() {
		return itemService.getAll();
	}
	@DeleteMapping("/delete/{id}")
	public String deleteItem(@PathVariable Long id) {
		return itemService.deleteItem(id);
	}
	@GetMapping("/find/{id}")
	public Item findById(@PathVariable Long id) {
		return itemService.findItemById(id);
	}

	
	@PutMapping("update/{id}")
	public Item updateItem(@PathVariable Long id, @RequestBody Item item) {
		return itemService.UpdateItem(id, item);
	}
	
	@PostMapping("/order")
	public String orderFood(@RequestBody User user) {
		return itemService.orderFood(user);
	}
	
	@PostMapping("/assign/{rId}{iId}")
	public String assignRestaurantToItem(@PathVariable Long rId, @PathVariable Long iId) {
		return itemService.assignRestaurantToItem(rId, iId);
	}

}
