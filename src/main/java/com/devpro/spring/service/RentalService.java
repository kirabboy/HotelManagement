package com.devpro.spring.service;

import com.devpro.spring.model.Chamber;
import com.devpro.spring.model.Guest;
import com.devpro.spring.model.Rental;

import java.util.List;

public interface RentalService {
	
	void addRentalInfo(Rental rental);
	
	List<String> getListChamberOrderFood();
	
	String getRentalIdOrderFood(String chamberNumber);
	
	Rental getRentalById(Long id);
	
	Rental getRentalCheckOutInfo(String chamberNumber);
	
	Guest getGuestCheckOutInfo(String chamberNumber);
	
	Chamber getChamberCheckOutInfo(String chamberNumbe);
	
	Integer getCheckTotalFoodPrice(String chamberNumber);
	
	Integer getCheckTotalServicePrice(String chamberNumber);
	
	Integer getNumberDaysStay(String chamberNumber);

}
