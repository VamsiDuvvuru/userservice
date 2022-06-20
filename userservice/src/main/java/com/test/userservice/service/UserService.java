package com.test.userservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.userservice.*;
import com.test.userservice.entity.PrincipalUser;


@Service
public interface UserService {
	
	public void saveUser(PrincipalUser user) throws Exception;
	
	public List<PrincipalUser> getUsers() throws Exception;
	
	public PrincipalUser getUserById(int id) throws Exception;

}
