package com.auditapp.customerservice.controller;

import com.auditapp.customerservice.entity.Customer;
import com.auditapp.customerservice.service.CustomerService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
@Slf4j
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/")
    public Customer saveCustomer(@RequestBody Customer customer){
        log.info("Inside saveCustomer of CustomerController.");
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/{id}")
    public Optional<Customer> findCustomerById(@PathVariable("id") Long customerId){
        log.info("Inside findCustomerById of CustomerController.");
        return customerService.findCustomerById(customerId);
    }
    
    @GetMapping("")
    public List<Customer> findAllCustomers(@PathVariable("name") String name) {
    	log.info("Inside findAllCustomers of CustomerController.");
    	return customerService.findAllCustomers(name);
    	
    }

}
