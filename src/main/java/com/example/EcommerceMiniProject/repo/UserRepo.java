package com.example.EcommerceMiniProject.repo;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.EcommerceMiniProject.model.User;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User, Serializable>  {
	 Optional<User> findOneByUsernameAndPasswordAndRole(String username, String password, String role);
	 User findByUsername(String username);
	 List<User> findByRole(String role);
//	 User findByRole(String role);
}
