package by.tretiak.demo.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User extends Person {

	@Column(name = "username")
	private String username;

	private String password;

	private String role;

	public User() {

	}
	
	public User(String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	public User(String username, String password, String name, Double weight, String role) {
		this.username = username;
		this.password = password;
		setName(name);
		setWeight(weight);
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [login=" + username + ", password=" + password + ", getId()=" + getId() + ", getName()="
				+ getName() + ", Weight=" + getWeight() + ", Goal=" + getGoal() + "]";
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
