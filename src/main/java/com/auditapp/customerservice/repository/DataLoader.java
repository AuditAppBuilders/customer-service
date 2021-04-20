package com.auditapp.customerservice.repository;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.auditapp.customerservice.entity.Customer;

@Component
public class DataLoader implements ApplicationRunner{

	private CustomerRepository customerRepository;
	
	public DataLoader(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
//		customerRepository.save(new Customer(1,"Swapnil K","Inactive",2,"04/05/1990","04/05/2020","PENDING",45,"Vipul P"));
		
	}

}
