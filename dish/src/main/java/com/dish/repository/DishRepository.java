package com.dish.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dish.entity.Dish;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long> {
}