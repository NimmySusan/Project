package com.restaurant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurant 
{
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Long restaurant_id;
	private String category;
	private String restaurant_name;
	private String location;
	private String resdetails;
	private String rating;
	private Boolean approval=false;
//	private Dish dish;
//	
//	public Dish getDish() {
//		return dish;
//	}
//	public void setDish(Dish dish) {
//		this.dish = dish;
//	}
	public Restaurant() {
	super();
	// TODO Auto-generated constructor stub
	}
	public Restaurant(Long restaurant_id,String category,String restaurant_name, String location, String resdetails) {
	super();
	this.restaurant_id = restaurant_id;
	this.category=category;
	this.restaurant_name=restaurant_name;
	this.location = location;
	this.resdetails = resdetails;
	//this.approval=approval;
//	this.dish=dish;
	}
	public Long getRestaurant_id() {
	return restaurant_id;
	}
	public void setRestaurant_id(Long restaurant_id) {
	this.restaurant_id = restaurant_id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getRestaurant_name() {
		return restaurant_name;
	}
	public void setRestaurant_name(String restaurant_name) {
		this.restaurant_name = restaurant_name;
	}
	public String getLocation() {
	return location;
	}
	public void setLocation(String location) {
	this.location = location;
	}
	public String getResdetails() {
	return resdetails;
	}
	public void setResdetails(String resdetails) {
	this.resdetails = resdetails;
	}
	public String getRating() {
	return rating;
	}
	public void setRating(String rating) {
	this.rating = rating;
	}
	public Boolean getApproval() {
	return approval;
	}
	public void setApproval(Boolean approval) {
	this.approval = approval;
	}
}
