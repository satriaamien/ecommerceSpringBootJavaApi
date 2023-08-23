package com.example.EcommerceMiniProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcommerceMiniProject.model.Product;
import com.example.EcommerceMiniProject.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductSerice {

	@Autowired
	private ProductRepo productRepo;
	
	@Override
	public String upsertProduct(Product product) {
		productRepo.save(product);
//		System.out.println("product :"+ product);
		return "success";
	}

	@Override
	public Product getById(Integer productId) {
		Optional<Product> findById =productRepo.findById(productId);
		
		if(findById.isPresent()){
			return findById.get();
		} 
		
		return null;
	}

	@Override
	public List<Product> getAllCourses() {
		return productRepo.findAll();
	}

	@Override
	public String deleteById(Integer productId) {
		if(productRepo.existsById(productId)) {
			productRepo.deleteById(productId);
			return "Delete Success";
		}else{
			return "No Record Found";
		}
	}

	@Override
	public List<Product> getUserByName(String name) {
		return productRepo.findByName(name);
	}

	@Override
	public List<Product> getUserByPrice(Double price) {
		return productRepo.findByPrice(price);
	}

	
	
}
