package com.example.EcommerceMiniProject.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.EcommerceMiniProject.model.Product;

@EnableJpaRepositories
@Repository
public interface ProductRepo extends JpaRepository<Product, Serializable>{
	List<Product> findByName(String name);
	List<Product> findByPrice(Double price);  
}
