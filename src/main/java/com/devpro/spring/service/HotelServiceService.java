package com.devpro.spring.service;

import com.devpro.spring.model.HotelService;

import java.util.List;

public interface HotelServiceService {
	
	List<HotelService> loadHotel();
	
	HotelService getService(Long id);
	
	void saveService(HotelService service);
	
	void deleteService(Long id);
}
