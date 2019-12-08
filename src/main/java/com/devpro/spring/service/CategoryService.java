package com.devpro.spring.service;

import com.devpro.spring.model.Category;

import java.util.List;

public interface CategoryService {

	List<Category> loadListCategories();
	
	Category getOne(Long id);
	
}
