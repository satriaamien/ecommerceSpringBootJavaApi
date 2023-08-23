package com.example.EcommerceMiniProject.service;

import java.util.List;

import com.example.EcommerceMiniProject.model.CartItem;

public interface CartItemService {
	public CartItem createHistoryTransaction(CartItem cartItem);
	public String deleteItemCart(Integer Id);
	public List<CartItem> seeHistoryTransaction();
}
