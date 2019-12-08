package com.devpro.spring.service;

import com.devpro.spring.model.OrderFood;
import com.devpro.spring.repository.OrderFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderFoodServiceImpl implements OrderFoodService {
	
	@Autowired
	private OrderFoodRepository orderFoodRepository;

	@Override
	public void addOrderFood(OrderFood orderFood) {
		// TODO Auto-generated method stub
		orderFoodRepository.save(orderFood);
	}

}
