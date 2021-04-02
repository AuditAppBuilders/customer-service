package com.auditapp.customerservice.repository;

import com.auditapp.customerservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {


//	Customer findCustomerById(Long customerId);
}
