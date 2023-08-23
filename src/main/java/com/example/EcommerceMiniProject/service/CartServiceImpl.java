package com.example.EcommerceMiniProject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcommerceMiniProject.model.Cart;
import com.example.EcommerceMiniProject.model.User;
import com.example.EcommerceMiniProject.repo.CartRepo;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepo cartRepo;
	
	@Override
	public String insertProduct(Cart cart) {
		cartRepo.save(cart);
		return "Success";
	}

	@Override
	public Cart seeDetailCart(String username) {
		Cart cart =  cartRepo.findByUsername(username);
		return cart;
	}

//	@Override
//	public Cart changePaymentMethod(Cart cart, String username) {
//		cartRepo.save(cart);
//		return cartRepo.findByUsername(username);
//	}

	
}
