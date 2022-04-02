package by.tretiak.demo.model.food;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private double caloriesContent;
	private double proteinsContent;
	private double fatContent;
	private double carbohydratesContent;

	public Product() {

	}

	public Product(Long id, String name, double caloriesContent, double proteinsContent, double fatContent,
			double carbohydratesContent) {
		super();
		this.id = id;
		this.name = name;
		this.caloriesContent = caloriesContent;
		this.proteinsContent = proteinsContent;
		this.fatContent = fatContent;
		this.carbohydratesContent = carbohydratesContent;
	}
	
	public Product(String name, double caloriesContent, double proteinsContent, double fatContent,
			double carbohydratesContent) {
		this.name = name;
		this.caloriesContent = caloriesContent;
		this.proteinsContent = proteinsContent;
		this.fatContent = fatContent;
		this.carbohydratesContent = carbohydratesContent;
	}
	
	

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", caloriesContent=" + caloriesContent + ", proteinsContent="
				+ proteinsContent + ", fatContent=" + fatContent + ", carbohydratesContent=" + carbohydratesContent
				+ "]";
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
