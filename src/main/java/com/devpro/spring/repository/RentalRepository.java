package com.devpro.spring.repository;

import com.devpro.spring.model.Chamber;
import com.devpro.spring.model.Guest;
import com.devpro.spring.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Long>{
	
	@Query(CustomQuery.MULTIPLE_GET_CHAMBERS_ORDER_FOOD)
	List<String> getListChamberOrderFood();

	@Query(CustomQuery.MULTIPLE_GET_RENTAL_ID)
	String getRentalIdOrderFood(@Param("chamberNumber") String chamberNumber);

	@Query(CustomQuery.MULTIPLE_GET_CHECK_OUT_INFO1)
	Rental getRentalCheckOutInfo(@Param("chamberNumber") String chamberNumber);

	@Query(CustomQuery.MULTIPLE_GET_CHECK_OUT_INFO2)
	Guest getGuestCheckOutInfo(@Param("chamberNumber") String chamberNumber);

	@Query(CustomQuery.MULTIPLE_GET_CHECK_OUT_INFO3)
	Chamber getChamberCheckOutInfo(@Param("chamberNumber") String chamberNumber);

	@Query(value = CustomQuery.MULTIPLE_GET_TOTAL_FOOD,nativeQuery = true)
	Integer getCheckTotalFoodPrice(@Param("chamberNumber") String chamberNumber);

	@Query(value = CustomQuery.MULTIPLE_GET_TOTAL_SERVICE,nativeQuery = true)
	Integer getCheckTotalServicePrice(@Param("chamberNumber") String chamberNumber);
	
	@Query(value = CustomQuery.MULTIPLE_GET_NUMBER_STAY,nativeQuery = true)
	Integer getNumberDaysStay(@Param("chamberNumber") String chamberNumber);



}
