package com.dish.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dish.entity.Dish;
import com.dish.repository.DishRepository;

@Service
public class DishServiceImpl implements DishService
{
	private DishRepository dishRepository;
	@Autowired
	public DishServiceImpl(DishRepository dishRepository)
	{
		this.dishRepository = dishRepository;
	}
	
	@Override
	public Dish getDish(Long dishid) 
	{
	// TODO Auto-generated method stub
	return null;
	}
	
	@Override
	public Dish save(Dish dishid) 
	{
		Dish obj=dishRepository.save(dishid);
		return obj;
	}

}