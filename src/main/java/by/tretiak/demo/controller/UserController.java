package by.tretiak.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import by.tretiak.demo.model.user.User;
import by.tretiak.demo.model.user.Features;
import by.tretiak.demo.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/registration")
	public String register(@ModelAttribute User newUser, @RequestParam int activity, @RequestParam int userGoal) {
		newUser.setGoal(new Features(userGoal, newUser.getWeight(), activity));
		newUser.setRole("USER");
		this.service.save(newUser);
		return "login";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return"login";
	}

}
