package by.tretiak.demo.model.user;

//@Entity
//@Table(name = "goals")
public class UserGoal {

	// for user goal
	//@Transient
	public static final int LOSEWEIGHT = 1;
	//@Transient
	public static final int KEEPFIT = 2;
	//@Transient
	public static final int GAINWEIGHT = 3;

	// lifeStyle
	//@Transient
	public static final double NOTACTIVE = 1;
	//@Transient
	public static final double ACTIVE = 2;
	//@Transient
	public static final double EXTREMAL = 3;

	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name = "id", nullable = false)
	private Long id;

	private double caloriesNeed; // count of calories user need to take a day
	private double proteinsNeed; // count of proteins user need to take a day
	private double fatNeed; // count of fats user need to take a day
	private double carbohydratesNeed; // count of carbohydrates user need to take a day

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserGoal() {

	}

	public UserGoal(int goal, double weight, double lifeStyle) {
		double caloriesNeed = (0.55 * weight + 2.8) * 240 * lifeStyle;
		if (goal == LOSEWEIGHT) {
			this.caloriesNeed = caloriesNeed * 0.87;
			this.proteinsNeed = this.caloriesNeed * 0.3;
			this.fatNeed = this.caloriesNeed * 0.25;
			this.carbohydratesNeed = this.caloriesNeed * 0.45;
		} else if (goal == KEEPFIT) {
			this.caloriesNeed = caloriesNeed;
			this.proteinsNeed = this.caloriesNeed * 0.3;
			this.fatNeed = this.caloriesNeed * 0.3;
			this.carbohydratesNeed = this.caloriesNeed * 0.4;
		} else if (goal == GAINWEIGHT) {
			this.caloriesNeed = caloriesNeed * 1.15;
			this.proteinsNeed = this.caloriesNeed * 0.35;
			this.fatNeed = this.caloriesNeed * 0.30;
			this.carbohydratesNeed = this.caloriesNeed * 0.50;
		}
	}

}
