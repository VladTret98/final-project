package by.tretiak.demo.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.tretiak.demo.model.food.Food;

@Repository
public interface FoodAppRepository /*extends JpaRepository<Food, Long>*/{
	
	public Food findByName();

}
