package com.mobileworld.services;

import java.util.List;

import com.mobileworld.entities.OrderDetail;

public interface OrderDetailService {

	List<OrderDetail> findByOrderID(int id);
	
	void save(OrderDetail orderDetail);
	
	void update(OrderDetail orderDetail);

}
