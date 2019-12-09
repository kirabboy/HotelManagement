package com.hieuboy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hieuboy.entities.Category;

public interface CategoryRepo extends CrudRepository<Category, Integer> {
	
	  List<Category> findByNameContaining(String q);
	
}
