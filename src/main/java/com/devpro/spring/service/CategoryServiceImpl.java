package com.devpro.spring.service;

import com.devpro.spring.model.Category;
import com.devpro.spring.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired 
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> loadListCategories() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Category getOne(Long id) {
		// TODO Auto-generated method stub
		return categoryRepository.getOne(id);
	}

}
