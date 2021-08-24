package com.customer.service;

//import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.entity.Customer;
//import com.customer.entity.Restaurant;
import com.customer.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService
{
	private CustomerRepository customerRepository;

	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository)
	{
		this.customerRepository = customerRepository;
	}
	
	@Override
	public Customer save(Customer customerId)
	{
		Customer obj = customerRepository.save(customerId);
		return obj;
	}
//	
//	@Override
//	public List<Restaurant> getAll()
//	{
//		
//		return null;
//	}
}
