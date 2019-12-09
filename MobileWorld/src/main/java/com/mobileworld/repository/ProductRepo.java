package com.mobileworld.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mobileworld.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Integer> {

	List<Product> findByNameContaining(String q);
	
	List<Product> findByPrice(long price);

}
