package com.customer.controller;

//import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.entity.Customer;
//import com.customer.entity.Restaurant;
import com.customer.service.CustomerService;

@RestController
@RequestMapping("/")
public class CustomerController 
{
	private CustomerService customerService;

	@Autowired
	public CustomerController(CustomerService customerService) 
	{
		this.customerService = customerService;
	}
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> save(@RequestBody Customer customerId)
	{
		Customer obj = customerService.save(customerId);
		return new ResponseEntity<Customer>(obj,HttpStatus.CREATED);
	}
	
//	@GetMapping("customer/{RestaurantName}")
//	public ResponseEntity<List<Restaurant>> getAll()
//	{
//		return new ResponseEntity<List<Restaurant>>((List<Restaurant>) customerService.getAll(), HttpStatus.OK);
//	}
}
