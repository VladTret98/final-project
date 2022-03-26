package by.tretiak.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.tretiak.demo.model.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByLogin(String login);

}
