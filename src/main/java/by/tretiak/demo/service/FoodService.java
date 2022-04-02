package by.tretiak.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.tretiak.demo.model.food.Dish;
import by.tretiak.demo.repository.DishRepository;

@Service
public class FoodService {
	
	@Autowired
	private DishRepository repository;
	
	public Dish findByDishName(String name) {
		return this.repository.findByDishName(name);
	}
	
	public void save(Dish dish) {
		this.repository.save(dish);
	}
	
	public void delete(Dish dish) {
		this.repository.delete(dish);
	}
	
	public void findById(Long id) {
		this.repository.findById(id);
	}
	
	

}
