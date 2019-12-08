package com.devpro.spring.service;

import com.devpro.spring.dto.FoodItemDto;
import com.devpro.spring.model.FoodItem;
import org.springframework.data.domain.Page;

import java.util.List;

public interface FoodItemService {

	List<FoodItem> loadToSelectOption();
	
	FoodItem getItem(Long id);
	
	FoodItemDto getFoodItem(Long id);
	
	Page<FoodItemDto> getListFoodItem(org.springframework.data.domain.Pageable pageable, String text);
	
	void saveFoodItem(FoodItem item);
	
	void deleteFoodItem(Long id);
}
