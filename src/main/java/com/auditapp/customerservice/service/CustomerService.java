package com.auditapp.customerservice.service;

import com.auditapp.customerservice.entity.Customer;
import com.auditapp.customerservice.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

//    public Customer findCustomerById(Long customerId) {
//        return customerRepository.findCustomerById(customerId);
//    }
    
    public Optional<Customer> findCustomerById(Long customerId) {
        return customerRepository.findById(customerId);
    }

	public List<Customer> findAllCustomers(String name) {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}
}
