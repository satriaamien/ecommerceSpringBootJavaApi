package com.example.EcommerceMiniProject.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EcommerceMiniProject.dto.LoginDto;
import com.example.EcommerceMiniProject.dto.UserDto;
import com.example.EcommerceMiniProject.model.User;
import com.example.EcommerceMiniProject.service.UserService;




@RestController
/* @CrossOrigin */
@RequestMapping("api")
public class UserController {

	@Autowired
	private UserService userService;
	
    @PostMapping(path = "relog/save")
    public String saveUser(@RequestBody UserDto userDto)
    {
        String id = userService.addUser(userDto);
        return id;
    }
    
    @PostMapping(path="relog/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDto loginDTO)
    {
        String loginResponse = userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
	
    @PutMapping(path = "relog/save")
    public String updateUser(@RequestBody UserDto userDto){
        String id = userService.addUser(userDto);
        return id;
    }
    
    @PostMapping(path="/relog/{username}")
    public ResponseEntity<?> deleteUser(@PathVariable String username){
    	String status = userService.deleteUser(username);
    	return ResponseEntity.ok(status);
    }
    
    @PostMapping(path="/logout")
    public ResponseEntity<?> logoutUser(){
    	String status =userService.logoutUser();
    	return ResponseEntity.ok(status);
    }
    
    //role diisi user, kalau diisi admin gabakal bisa
    @GetMapping(path="users/role/{role}")
    public ResponseEntity<?> getAllUser(@PathVariable String role){
    	List<User> getAll = userService.getAllUser(role);
    	return ResponseEntity.ok(getAll);
    }
    
    @GetMapping(path="users/{username}")
    public ResponseEntity<?> getDetailUser(@PathVariable String username){
    	User getUser = userService.getDetailUser(username);
    	return ResponseEntity.ok(getUser);
    }
}
