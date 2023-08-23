package com.example.EcommerceMiniProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcommerceMiniProject.dto.TransactionCartDto;
import com.example.EcommerceMiniProject.model.Cart;
import com.example.EcommerceMiniProject.model.CartItem;
import com.example.EcommerceMiniProject.model.Product;
import com.example.EcommerceMiniProject.repo.CartItemRepo;
import com.example.EcommerceMiniProject.repo.CartRepo;

@Service
public class CartItemServiceImpl implements CartItemService {

	@Autowired
	private CartItemRepo cartItemRepo;
	
	@Override
	public CartItem createHistoryTransaction(CartItem cartItem) {
		return cartItemRepo.save(cartItem);
	}

	@Override
	public String deleteItemCart(Integer Id) {
		if(cartItemRepo.existsById(Id)) {
			cartItemRepo.deleteById(Id);
			return "Delete Success";
		}else {
			return "No Username Found";
		}
	}

	@Override
	public List<CartItem> seeHistoryTransaction() {
		return cartItemRepo.findAll();
	}

	
	
//	@Override
//	public String seeHistoryTransaction(CartItem cartItem) {
//		Cart cart = 
//		return null;
//	}


}
