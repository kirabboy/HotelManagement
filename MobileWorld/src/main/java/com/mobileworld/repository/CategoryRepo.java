package com.mobileworld.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mobileworld.entities.Category;

public interface CategoryRepo extends CrudRepository<Category, Integer> {
	
	  List<Category> findByNameContaining(String q);
	
}
