package com.dish.controller;

//import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dish.entity.Dish;
import com.dish.service.DishService;

@RestController
@RequestMapping("/")
public class DishController
{
	private DishService dishService;
	@Autowired
	public DishController(DishService dishService)
	{
		this.dishService = dishService;
	}
	@PostMapping("/dish")
	public ResponseEntity<Dish> save(@RequestBody Dish dishid)
	{
		Dish obj=dishService.save(dishid);
		return new ResponseEntity<Dish>(obj,HttpStatus.CREATED);
	}
}