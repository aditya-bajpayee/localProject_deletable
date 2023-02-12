package com.employeeProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.employeeProject.model.User;
import com.employeeProject.repository.UserRepository;
import com.employeeProject.security.MyUserDetails;

public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
		User user = userRepository.getUserByUsername(username);
		
		if(user == null) {
			throw new UsernameNotFoundException("User not found");
		}
		
		return new MyUserDetails(user);
	}

}
