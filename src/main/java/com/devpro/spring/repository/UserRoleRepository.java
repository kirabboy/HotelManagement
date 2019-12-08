package com.devpro.spring.repository;

import com.devpro.spring.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Long>{

}
