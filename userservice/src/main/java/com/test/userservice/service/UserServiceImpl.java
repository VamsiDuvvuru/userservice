package com.test.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.test.userservice.*;
import com.test.userservice.entity.PrincipalUser;
import com.test.userservice.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public void saveUser(PrincipalUser user) throws Exception {
		// TODO Auto-generated method stub
		userRepo.save(user);
		
	}

	@Override
	public List<PrincipalUser> getUsers() throws Exception {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public PrincipalUser getUserById(int id) throws Exception {
		// TODO Auto-generated method stub
		return userRepo.findById(id);
	}

}
