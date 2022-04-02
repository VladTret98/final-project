package by.tretiak.demo.model;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.springframework.format.annotation.DateTimeFormat;

import by.tretiak.demo.model.food.Dish;
import by.tretiak.demo.model.food.Ingredient;
import by.tretiak.demo.model.user.User;

@Entity
@Table(name = "days")
public class Day {

	public Day() {
		this.date = new Date();
		this.dishes = new ArrayList<Dish>();
	}
	
	public Day(User user) {
		this.user = user;
		this.date = new Date();
		this.dishes = new ArrayList<Dish>();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "date")
	@DateTimeFormat(pattern = "yyyy-mm-dd hh-mm-ss")
	private Date date;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "dish_id", referencedColumnName = "id")
	private List<Dish> dishes;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;

	public Day(Long id, Date date, List<Dish> dishes, User user) {
		super();
		this.id = id;
		this.date = date;
		this.dishes = dishes;
		this.user = user;
	}
	
	public Day(Date date, List<Dish> dishes, User user) {
		this.date = date;
		this.dishes = dishes;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Day [id=" + id + ", date=" + date + ", dishes=" + dishes + ", user=" + user + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}
	
	public String getFormattedDate() {
		SimpleDateFormat form = new SimpleDateFormat("dd. MM. yyyy");
		return form.format(date);
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
