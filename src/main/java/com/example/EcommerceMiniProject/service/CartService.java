package com.example.EcommerceMiniProject.service;

import com.example.EcommerceMiniProject.model.Cart;

public interface CartService {
	public String insertProduct(Cart cart); 
	public Cart seeDetailCart(String username);
//	public Cart changePaymentMethod(Cart cart, String username);
}
