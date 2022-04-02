package by.tretiak.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.tretiak.demo.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;

}
