package com.devpro.spring.repository;

import com.devpro.spring.model.HotelService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelServiceRepository extends JpaRepository<HotelService, Long>{
	
}
