package com.online_food.food.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity   //for creating table
@Table(name="user")
public class User {
	@Id //primary key
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userId;
	private String name;

	private Long contactNo;
	private String gender;
	private String emailId;
	private Long totalBill;
	
	public void setTotalBill(Long totalBill) {
		this.totalBill = totalBill;
	}
	public Long getTotalBill() {
		return totalBill;
	}
	@OneToMany(mappedBy = "user")
	@JsonManagedReference
	List<Cart> cart;
	
	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}
	public List<Cart> getCart() {
		return cart;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	

	

}
