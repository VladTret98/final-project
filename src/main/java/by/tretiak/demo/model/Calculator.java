package by.tretiak.demo.model;

import java.util.List;

import by.tretiak.demo.model.food.Dish;
import by.tretiak.demo.model.food.Ingredient;
import by.tretiak.demo.model.user.Features;

public class Calculator implements Calculating{
	
	public static Features calculateEatenFeatures(Dish... dishes) {
		Features eatenFeatures = new Features();
		
		for (Dish dish : dishes) {
			for (Ingredient ingredient : dish.getIngredients()) {
				eatenFeatures.addToFeatures(ingredient);
			}
		}
		return eatenFeatures;
	}
	
	public static Features calculateEatenFeatures(List<Dish> dishes) {
		Features eatenFeatures = new Features();
		for (Dish dish : dishes) {
			for (Ingredient ingredient : dish.getIngredients()) {
				eatenFeatures.addToFeatures(ingredient);
			}
		}
		return eatenFeatures;
	}
	
	public static void addDish(Day day, Dish dish) {
		for (Ingredient ingredient : dish.getIngredients()) {
			
		}
	}

	

}
