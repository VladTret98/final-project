package by.tretiak.demo.model;

import by.tretiak.demo.model.user.Features;
import by.tretiak.demo.model.user.User;

public class DailyInfo {

	private Day day;

	private User user;
	
	private Features dayResult;

	public DailyInfo() {

	}

	public DailyInfo(Day day, User user, Features result) {
		this.day = day;
		this.user = user;
		this.dayResult = result;
	}

	@Override
	public String toString() {
		return "DailyInfo [day=" + day + ", user=" + user + ", dayResult=" + dayResult + "]";
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Features getDayResult() {
		return dayResult;
	}

	public void setDayResult(Features dayResult) {
		this.dayResult = dayResult;
	}

}
