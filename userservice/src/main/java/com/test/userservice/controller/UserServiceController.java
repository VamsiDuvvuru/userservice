package com.test.userservice.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.userservice.entity.PrincipalUser;
import com.test.userservice.service.UserService;


@RestController
@RequestMapping("/users")
public class UserServiceController {
	
	@Autowired
	private UserService userService;
	static {
		
	}
	
	private static List<PrincipalUser> users=new ArrayList<>();
	@GetMapping("/")
	public List<PrincipalUser> getUsers() throws Exception{
		
		//return userService.getUsers();
		PrincipalUser user1=new PrincipalUser(1,"apple","apple@gmail.com");
		PrincipalUser user2=new PrincipalUser(2,"mango","mango@gmail.com");
		PrincipalUser user3=new PrincipalUser(3,"grape","grape@gmail.com");
		users.add(user3);
		users.add(user2);
		users.add(user1);
		return users;
	}
	
	@PostMapping("/")
	public String saveUser(@RequestBody PrincipalUser user) throws Exception{
		System.out.println(user.getName());
		System.out.println(user.toString());
		PrincipalUser user1=new PrincipalUser(1,"apple","apple@gmail.com");
		PrincipalUser user2=new PrincipalUser(2,"mango","mango@gmail.com");
		PrincipalUser user3=new PrincipalUser(3,"grape","grape@gmail.com");
		users.add(user3);
		users.add(user2);
		users.add(user1);
		//userService.saveUser(user);
		return "success";
	}
	
	@GetMapping("/{id}")
	public PrincipalUser getUserById(@PathVariable("id") Integer id) throws Exception{
		
		return userService.getUserById(id);
		
	}

}
