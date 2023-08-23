package com.example.EcommerceMiniProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EcommerceMiniProject.model.Cart;
import com.example.EcommerceMiniProject.model.User;
import com.example.EcommerceMiniProject.service.CartService;

@RestController
@RequestMapping("api")
public class CartController {

	@Autowired
	private CartService cartService;
	
	@PostMapping("/cart")
	public ResponseEntity<String> insertProduct(@RequestBody Cart cart) {
		String status = cartService.insertProduct(cart);
		return new ResponseEntity<String>(status, HttpStatus.CREATED);
	}
	
	@GetMapping("/cart/{username}")
	public ResponseEntity<Cart> seeDetailsCart(@PathVariable String username){
		Cart detailsCart = cartService.seeDetailCart(username);
		return new ResponseEntity<Cart>(detailsCart, HttpStatus.OK);
	}
	
	@PutMapping("/cart")
	public ResponseEntity<String> pickPaymentMethod(@RequestBody Cart cart){
		String status = cartService.insertProduct(cart);
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}
	
	
}
