package com.example.EcommerceMiniProject.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.EcommerceMiniProject.model.CartItem;

@EnableJpaRepositories
@Repository
public interface CartItemRepo extends JpaRepository<CartItem, Serializable>{

}
