package com.devpro.spring.service;

import com.devpro.spring.model.UserRole;
import com.devpro.spring.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserRoleService {
	
	@Autowired
	private UserRoleRepository userRoleRepository;
	
	public void saveUserRole(UserRole userRole) {
		userRoleRepository.save(userRole);
	}
}
