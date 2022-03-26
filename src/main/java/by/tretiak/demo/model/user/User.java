package by.tretiak.demo.model.user;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User extends Person{

	private String login;
	
	private String password;
	
	public User() {
		
	}

	
	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", Weight=" + getWeight() + ", Goal=" + getGoalId() + "]";
	}




	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
