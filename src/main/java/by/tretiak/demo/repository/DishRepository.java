package by.tretiak.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.tretiak.demo.model.food.Dish;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long> {
	
	public Dish findByDishName(String name);

}
