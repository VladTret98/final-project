package by.tretiak.demo.model.food;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name = "ingredients")
public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id", referencedColumnName = "id")
	private Product product;

//	@ManyToMany
//	@JoinColumn(name = "dish_id", referencedColumnName = "id")
//	private List<Dish> dishes;

	private Double weight;

	public Ingredient() {

	}

	public Ingredient(Long id, Product product, Double weight) {
		super();
		this.id = id;
		this.product = product;
		this.weight = weight;
	}
	
	public Ingredient(Product product, Double weight) {
		this.product = product;
		this.weight = weight;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", product=" + product + ", weight=" + weight + "]";
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
