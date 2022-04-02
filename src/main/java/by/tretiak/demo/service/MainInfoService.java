package by.tretiak.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import by.tretiak.demo.model.Day;
import by.tretiak.demo.model.food.Dish;
import by.tretiak.demo.model.food.Ingredient;
import by.tretiak.demo.model.food.Product;
import by.tretiak.demo.model.user.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import by.tretiak.demo.exception.UserNotFoundException;
import by.tretiak.demo.model.Calculator;
import by.tretiak.demo.model.DailyInfo;

@Service
public class MainInfoService {

	@Autowired
	private UserService userService;

	@Autowired
	private DayService dayService;

	@DateTimeFormat(pattern = "yyyy-mm-dd")
	public DailyInfo collectInfo(User user, Date date) {		
		DailyInfo info = this.dayService.getDayInfo(user, date);
		return info;
	}

	public DailyInfo addDish(Dish dish, String[] names, double[] weight, double[] calories, double[] proteins,
			double[] fat, double[] carbohydrates, HttpSession session) {
		List<Ingredient> ingredients = new ArrayList<Ingredient>();
		for (int i = 0; i < names.length; i++) {
			ingredients.add(new Ingredient(new Product(names[i], calories[i], proteins[i], fat[i], carbohydrates[i]),
					weight[i]));
		}
		dish.setIngredients(ingredients);
		DailyInfo di = (DailyInfo) session.getAttribute("daysInfo");
		Day day = di.getDay();
		day.getDishes().add(dish);
		this.dayService.update(day);
		di.setDayResult(Calculator.calculateEatenFeatures(day.getDishes()));
		return di;
	}
	
	public User login(String userName, String password) throws UserNotFoundException{
		return this.userService.login(userName, password);
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public DayService getDayService() {
		return dayService;
	}

	public void setDayService(DayService dayService) {
		this.dayService = dayService;
	}

}
