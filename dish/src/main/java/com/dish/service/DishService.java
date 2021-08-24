package com.dish.service;
import com.dish.entity.Dish;

public interface DishService {
	Dish getDish(Long dishid );

	Dish save(Dish dishid);

}
