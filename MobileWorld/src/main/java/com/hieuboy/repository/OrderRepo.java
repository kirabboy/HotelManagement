package com.hieuboy.repository;

import org.springframework.data.repository.CrudRepository;

import com.hieuboy.entities.Order;

public interface OrderRepo extends CrudRepository<Order, Integer>  {

}
