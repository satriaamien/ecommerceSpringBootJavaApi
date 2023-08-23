package com.example.EcommerceMiniProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EcommerceMiniProject.model.CartItem;
import com.example.EcommerceMiniProject.service.CartItemService;

@RestController
@RequestMapping("api")
public class CartItemController {

	@Autowired
	private CartItemService cartItemService;
	
	@PostMapping("/cartitem")
	public ResponseEntity<CartItem> createCartItem(@RequestBody CartItem cartItem){
		CartItem status = cartItemService.createHistoryTransaction(cartItem);
		return new ResponseEntity<CartItem>(status,HttpStatus.CREATED);
	}
	
	@PutMapping("/cartitem")
	public ResponseEntity<CartItem> updateCartItem(@RequestBody CartItem cartItem){
		CartItem status = cartItemService.createHistoryTransaction(cartItem);
		return new ResponseEntity<CartItem>(status,HttpStatus.OK);
	}
	
	@PostMapping("/cartitem/{Id}")
	public ResponseEntity<String> deleteCartItem(@PathVariable Integer Id){
		String status = cartItemService.deleteItemCart(Id);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
	
	@PostMapping("/cartitems")
	public ResponseEntity<List<CartItem>> seeHistoryTransaction(){
		List<CartItem> history = cartItemService.seeHistoryTransaction();
		return new ResponseEntity<List<CartItem>>(history,HttpStatus.OK);
	}
}
