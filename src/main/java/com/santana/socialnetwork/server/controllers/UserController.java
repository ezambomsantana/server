package com.santana.socialnetwork.server.controllers;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.santana.socialnetwork.model.User;
import com.santana.socialnetwork.server.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    @Inject
    UserRepository userRepository;
    
    @RequestMapping("/loggin")
    public User loggin(
    		@RequestParam(value="email") String email,
    		@RequestParam(value="password") String password) {
    	User user = userRepository.findUserByEmailAndPassword(email, password);
    	return user;
    }	
}