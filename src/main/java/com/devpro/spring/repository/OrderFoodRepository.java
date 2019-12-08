package com.devpro.spring.repository;

import com.devpro.spring.model.OrderFood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderFoodRepository extends JpaRepository<OrderFood, Long>{

}
