package com.devpro.spring.repository;

import com.devpro.spring.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoleRepository extends JpaRepository<AppRole, Long> {
	
	@Query("select ur.appRole.roleName from UserRole ur where ur.appUser.userId = :userId")
	public List<String> getRoleNames(@Param("userId") Long userId);
}
