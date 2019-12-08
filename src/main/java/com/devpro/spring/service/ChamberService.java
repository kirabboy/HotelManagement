package com.devpro.spring.service;

import com.devpro.spring.model.Chamber;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ChamberService {

	Chamber findChamber(Long id);
	
	Page<Chamber> searchChamber(Pageable pageable, String text);

	Page<Chamber> searchChamberWithPrice1(Pageable pageable, String type, String vip);

	Page<Chamber> searchChamberWithPrice2(Pageable pageable, String type, String vip);

	Page<Chamber> searchChamberWithPrice3(Pageable pageable, String type, String vip);

	void addChamber(String number, String type, String price, String area, String note, String fvip);

	void deleteChamber(Long chamberId);

	void updateCheckIn(Long id); // update lai trang thai phong khi check in

	void updateCheckOut(Long id);

	void updateChamberInfo(String number, String type, String price, String area, String note, String vip, Long id);


}
