package by.tretiak.demo.model.food;

//@Entity
//@Table(name = "ingredients")
public class Product {

	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private double caloriesContent;
	private double proteinsContent;
	private double fatContent;
	private double carbohydratesContent;

	public Product() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCaloriesContent() {
		return caloriesContent;
	}

	public void setCaloriesContent(double caloriesContent) {
		this.caloriesContent = caloriesContent;
	}

	public double getProteinsContent() {
		return proteinsContent;
	}

	public void setProteinsContent(double proteinsContent) {
		this.proteinsContent = proteinsContent;
	}

	public double getFatContent() {
		return fatContent;
	}

	public void setFatContent(double fatContent) {
		this.fatContent = fatContent;
	}

	public double getCarbohydratesContent() {
		return carbohydratesContent;
	}

	public void setCarbohydratesContent(double carbohydratesContent) {
		this.carbohydratesContent = carbohydratesContent;
	}
}
