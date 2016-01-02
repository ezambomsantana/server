package com.santana.socialnetwork.server.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.santana.socialnetwork.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	  List<User> findUserByEmail(String email);
	  
	  User findUserByEmailAndPassword(String email, String password);
}
