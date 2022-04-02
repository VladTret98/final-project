package by.tretiak.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import by.tretiak.demo.exception.UserNotFoundException;
import by.tretiak.demo.model.DailyInfo;
import by.tretiak.demo.model.Day;
import by.tretiak.demo.model.food.Dish;
import by.tretiak.demo.model.food.Ingredient;
import by.tretiak.demo.model.food.Product;
import by.tretiak.demo.model.user.Features;
import by.tretiak.demo.model.user.User;
import by.tretiak.demo.service.MainInfoService;
import by.tretiak.demo.service.UserService;

@Controller
public class MainController {

	@Autowired
	UserService detailsService;
	
	@Autowired
	private MainInfoService service;

	@GetMapping(value = "/")
	public String getLoginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String login(@RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password, HttpSession session, Model model) {
		UserDetails userDetails = detailsService.loadUserByUsername(username);
		if (userDetails.getPassword().equals(password)
				&& userDetails.getUsername().equals(username)) {
			model.addAttribute("userName", username);
			model.addAttribute("password", password);
			
			return logged(session, model);
		} else {
			session.setAttribute("userNotFoundException", "error");
			return "login";

		}

	}
	
	public String logged(HttpSession session, Model model) {
		String username = (String) model.getAttribute("userName");
		String password = (String) model.getAttribute("password");
		if (session.getAttribute("dayException") != null)
			session.removeAttribute("dayException");
		User user;
		try {
			user = this.service.login(username, password);
		} catch (UserNotFoundException e) {
			session.setAttribute("userNotFoundException", e.message);
			return "loginPage";
		} 
		DailyInfo info = this.service.collectInfo(user, new Date());
		session.setAttribute("daysInfo", info);
		return "mainpage";
	}

	@GetMapping("/adddish")
	public String goToAddDish() {
		return "adddish";
	}

	@PostMapping("/adddish")
	public String addDish(@RequestParam(name = "dishName") String dishName,
			@RequestParam(name = "ingredientName") String[] names, @RequestParam(name = "weight") double[] weight,
			@RequestParam(name = "caloriesContent") double[] calories,
			@RequestParam(name = "proteinsContent") double[] proteins, @RequestParam(name = "fatContent") double[] fat,
			@RequestParam(name = "carbohydratesContent") double[] carbohydrates, HttpSession session) {
		session.setAttribute("dayException", null);
		Dish newDish = new Dish();
		newDish.setName(dishName);
		DailyInfo info = this.service.addDish(newDish, names, weight, calories, proteins, fat, carbohydrates, session);
		session.removeAttribute("daysInfo");
		session.setAttribute("daysInfo", info);
		System.out.println(info);
		return "mainpage";
	}

}
