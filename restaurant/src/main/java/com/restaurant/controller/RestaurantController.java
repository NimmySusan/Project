package com.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.entity.Restaurant;
import com.restaurant.service.RestaurantService;

@RestController
@RequestMapping("/")
public class RestaurantController
{
	private RestaurantService restaurantService;
	@Autowired
	public RestaurantController(RestaurantService restaurantService)
	{
	this.restaurantService = restaurantService;
	}
	@PostMapping("/restaurant")
	public ResponseEntity<Restaurant> save(@RequestBody Restaurant restaurant_id)
	{
	Restaurant obj = restaurantService.save(restaurant_id);
	return new ResponseEntity<Restaurant>(obj,HttpStatus.CREATED);
	}
	
}
