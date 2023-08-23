package com.example.EcommerceMiniProject.service;

import java.util.List;

import com.example.EcommerceMiniProject.model.Product;

public interface ProductSerice {
	public String upsertProduct (Product product);
	
	public Product getById(Integer productId);

	public List<Product> getAllCourses();

	public String deleteById(Integer productId);
	
	public List<Product> getUserByName(String name);
	
	public List<Product> getUserByPrice(Double price);

	
}
