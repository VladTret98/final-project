package by.tretiak.demo.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import by.tretiak.demo.model.food.Ingredient;

@Entity
@Table(name = "features")
public class Features {

	// for user goal
	@Transient
	public static final int LOSEWEIGHT = 1;
	@Transient
	public static final int KEEPFIT = 2;
	@Transient
	public static final int GAINWEIGHT = 3;

	// lifeStyle
	@Transient
	public static final int NOTACTIVE = 1;
	@Transient
	public static final int ACTIVE = 2;
	@Transient
	public static final int EXTREMAL = 3;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	private Double calories; // percent of calories user need to take a day
	private Double proteins; // percent of proteins user need to take a day
	private Double fat; // percent of fats user need to take a day
	private Double carbohydrates; // percent of carbohydrates user need to take a day

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Features() {
		this.calories = 0D;
		this.carbohydrates = 0D;
		this.fat = 0D;
		this.proteins = 0D;
	}

	public Features(int goal, Double weight, int lifeStyle) {
		double caloriesNeed = (0.55 * weight + 2.8) * 240 * lifeStyle;
		if(goal == LOSEWEIGHT) {
			this.calories = caloriesNeed * 0.87;
			this.proteins = this.calories * 0.3;
			this.fat = this.calories * 0.25;
			this.carbohydrates = this.calories * 0.45;
		} else if(goal == KEEPFIT) {
			this.calories = caloriesNeed;
			this.proteins = this.calories * 0.3;
			this.fat = this.calories * 0.3;
			this.carbohydrates = this.calories * 0.4;
		} else if(goal == GAINWEIGHT) {
			this.calories = caloriesNeed * 1.15;
			this.proteins = this.calories * 0.35;
			this.fat = this.calories * 0.30;
			this.carbohydrates = this.calories * 0.50;
		} 
	}


	public void addToFeatures(Ingredient ingredient) {
		this.calories += (((ingredient.getWeight() / 100) + ingredient.getWeight() % 100) * ingredient.getProduct().getCaloriesContent());
		this.carbohydrates += (((ingredient.getWeight() / 100) + ingredient.getWeight() % 100) * ingredient.getProduct().getCarbohydratesContent());
		this.fat += (((ingredient.getWeight() / 100) + ingredient.getWeight() % 100) * ingredient.getProduct().getFatContent());
		this.proteins += (((ingredient.getWeight() / 100) + ingredient.getWeight() % 100) * ingredient.getProduct().getProteinsContent());
	}

	@Override
	public String toString() {
		return "UserGoal [id=" + id + ", caloriesNeed=" + calories + ", proteinsNeed=" + proteins + ", fatNeed=" + fat
				+ ", carbohydratesNeed=" + carbohydrates + "]";
	}

	public Double getCalories() {
		return calories;
	}

	public void setCalories(Double calories) {
		this.calories = calories;
	}

	public Double getProteins() {
		return proteins;
	}

	public void setProteins(Double proteins) {
		this.proteins = proteins;
	}

	public Double getFat() {
		return fat;
	}

	public void setFat(Double fat) {
		this.fat = fat;
	}

	public Double getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(Double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

}
