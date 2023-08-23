package com.example.EcommerceMiniProject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.EcommerceMiniProject.dto.LoginDto;
import com.example.EcommerceMiniProject.dto.UserDto;
import com.example.EcommerceMiniProject.model.User;
import com.example.EcommerceMiniProject.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired UserRepo userRepo;
	
	@Autowired PasswordEncoder passwordEncoder;
	
	@Override
	public String addUser(UserDto userDto) {
		User user = new User(
			userDto.getUsername(),
			this.passwordEncoder.encode(userDto.getPassword()),
			userDto.getRole()
		);
		userRepo.save(user);
		return user.getUsername();
	}

	@Override
	public String loginUser(LoginDto loginDto) {
        User user1 = userRepo.findByUsername(loginDto.getUsername());
        if (user1 != null) {
            String password = loginDto.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> employee = userRepo.findOneByUsernameAndPasswordAndRole(loginDto.getUsername(), encodedPassword,loginDto.getRole());
                if (employee.isPresent()) {
                    return "Login Success";
                } else {
                    return"Login Failed";
                }
            } else {
                return "password Not Match";
            }
        }else {
            return "Email not exits";
        }
	}

	@Override
	public String deleteUser(String username) {
		if(userRepo.existsById(username)) {
			userRepo.deleteById(username);
			return "Delete Success";
		}else {
			return "No Username Found";
		}
	}

	@Override
	public String logoutUser() {
		return "Logout Success";
	}

//	@Override
//	public List<User> getAllUser(UserDto userDto) {
//		User role1 = userRepo.findByRole(userDto.getRole());
//		System.out.println("role1 : "+ role1);
////		if (user1!=null) {
////			
////		}
//		return user1;
//	}

	@Override
	public List<User> getAllUser(String role) {
		List<String> list=new ArrayList<String>();
		list.add("User Not Found");
		List<User> repos = userRepo.findByRole(role);
		String user =repos.get(0).getRole();
//		System.out.println("findROLE : "+);
		if(user.equals("user")){
			return userRepo.findByRole(role);
		}else {
			return null;
		}
		
	}

	@Override
	public User getDetailUser(String username) {
		Optional<User> findById =  userRepo.findById(username);
		String admin = findById.get().getRole();
//		System.out.println(admin.equals("admin"));
		if (findById.isPresent() && !admin.equals("admin")) {
			return findById.get();
		}
		return null;
	}

}
