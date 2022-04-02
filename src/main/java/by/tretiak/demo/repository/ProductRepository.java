package by.tretiak.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import by.tretiak.demo.model.food.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
	
	
}
