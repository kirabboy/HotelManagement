package com.devpro.spring.repository;

import com.devpro.spring.model.ServiceBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceBillRepository extends JpaRepository<ServiceBill, Long>{

}
