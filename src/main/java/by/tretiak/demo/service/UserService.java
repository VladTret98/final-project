package by.tretiak.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import by.tretiak.demo.exception.UserNotFoundException;
import by.tretiak.demo.model.user.MyUserDetails;
import by.tretiak.demo.model.user.User;
import by.tretiak.demo.repository.UserRepository;

@Service
public class UserService implements UserDetailsService{
	
	@Autowired
	private UserRepository repository;
	
	public Optional<User> findById(Long id) {
		return this.repository.findById(id);
	}
	
	public void save(User user) {
		this.repository.save(user);
	}

	public void delete(User user) {
		this.repository.delete(user);
	}

	public List<User> findAll() {
		return this.repository.findAll();
	}

	public User findByUserName(String login) {
		return this.repository.findByUsername(login);
	}
	
	public User login(String userName, String password) throws UserNotFoundException {
		User user = findByUserName(userName);
		if(user == null) {
			throw new UserNotFoundException("Пользователь не найден");
		}
		if(user.getPassword().equals(password)) {
			return user;
		} else {
			throw new UserNotFoundException("Неверный пароль");
		}
	}

	@Override
	public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException {
		User user = repository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("Could not find user");
		}
		return new MyUserDetails(user);
	}
	
}
