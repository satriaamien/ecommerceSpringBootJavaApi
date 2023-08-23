package com.example.EcommerceMiniProject.service;

import java.util.List;

import com.example.EcommerceMiniProject.dto.LoginDto;
import com.example.EcommerceMiniProject.dto.UserDto;
import com.example.EcommerceMiniProject.model.User;


public interface UserService {
	public String addUser (UserDto userDto);
	public String loginUser(LoginDto loginDto);
	public String deleteUser(String username);
	public String logoutUser();
	public List<User> getAllUser(String role);
	public User getDetailUser(String username);
//	public List<User> getAllUser(UserDto userDto);
	
}
