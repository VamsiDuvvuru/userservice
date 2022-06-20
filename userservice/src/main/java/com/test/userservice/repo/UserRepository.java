package com.test.userservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.userservice.entity.PrincipalUser;


@Repository
public interface  UserRepository extends JpaRepository<PrincipalUser, Integer> {
	
	PrincipalUser save(PrincipalUser user);
	
	List<PrincipalUser> findAll();
	
	PrincipalUser findById(int id);
}
