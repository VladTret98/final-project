package by.tretiak.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.tretiak.demo.model.food.Ingredient;

@Repository
public interface IngredientsRepository extends JpaRepository<Ingredient, Long>{
	
	public Ingredient findByProductName(String name);

}
