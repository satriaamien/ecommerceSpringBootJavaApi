package com.example.EcommerceMiniProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EcommerceMiniProject.model.Product;
import com.example.EcommerceMiniProject.service.ProductSerice;


@RestController
/* @CrossOrigin */
@RequestMapping("api")
public class ProductController {
	
	@Autowired
	private ProductSerice productSerice;
	
	@PostMapping("/product")
	public ResponseEntity<String> createProduct(@RequestBody Product product){
		String status = productSerice.upsertProduct(product);
		return new ResponseEntity<String>(status, HttpStatus.CREATED);
	}
	@GetMapping("/product/{productId}")
	public ResponseEntity<Product> getProduct(@PathVariable Integer productId) {
		Product course = productSerice.getById(productId);
		return new ResponseEntity<>(course, HttpStatus.OK);
	}

	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllCourses() {
		List<Product> allCourses = productSerice.getAllCourses();
		return new ResponseEntity<>(allCourses, HttpStatus.OK);
	}

	@PutMapping("/product")
	public ResponseEntity<String> updateCourse(@RequestBody Product product) {
		String status = productSerice.upsertProduct(product);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

	@DeleteMapping("/product/{productId}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer productId) {
		String status = productSerice.deleteById(productId);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
	
	@GetMapping("/products/name/{name}")
	public ResponseEntity<List<Product>> getUserFilter(@PathVariable String name){
		List <Product> filterNameProduct = productSerice.getUserByName(name);
		return new ResponseEntity<>(filterNameProduct, HttpStatus.OK);
	}
	
	@GetMapping("/products/price/{price}")
	public ResponseEntity<List<Product>> getPriceFilter(@PathVariable Double price){
		List <Product> filterNameProduct = productSerice.getUserByPrice(price);
		return new ResponseEntity<>(filterNameProduct, HttpStatus.OK);
	}
	
}
