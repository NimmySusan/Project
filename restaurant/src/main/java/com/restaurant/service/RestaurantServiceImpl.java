package com.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.entity.Restaurant;
import com.restaurant.repository.RestaurantRepository;

@Service
public class RestaurantServiceImpl implements RestaurantService
{
	private RestaurantRepository restaurantRepository;
	@Autowired
	public RestaurantServiceImpl(RestaurantRepository restaurantRepository)
	{
		this.restaurantRepository = restaurantRepository;
	}
	@Override
	public Restaurant save(Restaurant restaurant_id)
	{
		Restaurant obj = restaurantRepository.save(restaurant_id);
		return obj;
	}
}
