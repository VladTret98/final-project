package by.tretiak.demo.model.food;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import by.tretiak.demo.model.Calculator;
import by.tretiak.demo.model.user.Features;




@Entity
@Table(name = "dishes")
public class Dish {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String dishName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ingredient_id", referencedColumnName = "id")
	private List<Ingredient> ingredients;

	public Dish() {

	}

	public Dish(Long id, String name, List<Ingredient> ingredients) {
		super();
		this.id = id;
		this.dishName = name;
		this.ingredients = ingredients;
	}
	
	public Dish(String name, List<Ingredient> ingredients) {
		super();
		this.dishName = name;
		this.ingredients = ingredients;
	}
	
	public Features calculateFeatures() {
		return Calculator.calculateEatenFeatures(this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return dishName;
	}

	public void setName(String name) {
		this.dishName = name;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + dishName + ", ingredients=" + ingredients + "]";
	}
	
	
}
