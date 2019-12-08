package com.devpro.spring.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "category_id")
	private Long categoryId;
	
	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Set<FoodItem> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(Set<FoodItem> foodItems) {
		this.foodItems = foodItems;
	}

	@Column(name = "category_name")
	private String categoryName;
	
	@OneToMany(mappedBy = "category")
	private Set<FoodItem> foodItems;
}
