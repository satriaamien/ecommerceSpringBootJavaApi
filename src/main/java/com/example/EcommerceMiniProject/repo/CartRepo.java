package com.example.EcommerceMiniProject.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.EcommerceMiniProject.model.Cart;

@EnableJpaRepositories
@Repository
public interface CartRepo extends JpaRepository<Cart, Serializable> {
	Cart findByUsername(String username);
}
