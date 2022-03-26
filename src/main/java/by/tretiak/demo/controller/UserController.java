package by.tretiak.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import by.tretiak.demo.model.user.Person;
import by.tretiak.demo.model.user.User;
import by.tretiak.demo.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/login")
	public String login(@RequestParam(name = "userLogin") String login,
			@RequestParam(name = "password") String password, HttpSession session) {
		System.out.println(login + "  " + password);
		session.setAttribute("login", login);
		return "mainpage";
	}

	@PostMapping("/registration")
	public String registrate(@ModelAttribute User user,  HttpSession session) {
		System.out.println(user.toString());
		return "mainpage";
	}

}
