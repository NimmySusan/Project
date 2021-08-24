package com.dish.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dish 
{
	@Id
	private Long dishid;
	private Long resid;
	private String dishname;
	private Long price;
	private String availability;
	
	public Dish() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Dish(Long resid, Long dishid, String dishname, Long price, String availability) {
		super();
		this.resid = resid;
		this.dishid = dishid;
		this.dishname = dishname;
		this.price = price;
		this.availability = availability;
	}
	public Long getResid() {
		return resid;
	}
	public void setResid(Long resid) {
		this.resid = resid;
	}
	public Long getDishid() {
		return dishid;
	}
	public void setDishid(Long dishid) {
		this.dishid = dishid;
	}
	public String getDishname() {
		return dishname;
	}
	public void setDishname(String dishname) {
		this.dishname = dishname;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	

}