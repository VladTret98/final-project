package by.tretiak.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.tretiak.demo.model.user.User;
import by.tretiak.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	public void save(User user) {
		this.repository.save(user);
	}

	public void delete(User user) {
		this.repository.delete(user);
	}

	public List<User> findAll() {
		return this.repository.findAll();
	}

	public User findByLogin(String login) {
		return this.repository.findByLogin(login);
	}
	
}
