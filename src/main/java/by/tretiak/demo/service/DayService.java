package by.tretiak.demo.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.tretiak.demo.exception.NoSuchDaysException;
import by.tretiak.demo.model.Calculator;
import by.tretiak.demo.model.DailyInfo;
import by.tretiak.demo.model.Day;
import by.tretiak.demo.model.user.User;
import by.tretiak.demo.repository.DayRepository;

@Service
public class DayService {

	@Autowired
	private DayRepository repository;

	public Optional<List<Day>> findByDate(Date date, Long userId) {
		Optional<List<Day>> opt = this.repository.findByUserId(userId);
		return opt;
	}

	public DailyInfo getNextDay(HttpSession session) throws NoSuchDaysException {
		DailyInfo in = (DailyInfo) session.getAttribute("daysInfo");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(in.getDay().getDate());
		calendar.add(Calendar.DATE, +1);
		Date newDate = calendar.getTime();
		if (getActualDay(newDate, in.getUser()).isPresent()) {
			return getDayInfo(in.getUser(), newDate);
		} else {
			throw new NoSuchDaysException("Дальше нельзя");
		}
	}

	public DailyInfo getPreviousDay(HttpSession session) throws NoSuchDaysException {
		DailyInfo in = (DailyInfo) session.getAttribute("daysInfo");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(in.getDay().getDate());
		calendar.add(Calendar.DATE, -1);
		Date newDate = calendar.getTime();
		if (getActualDay(newDate, in.getUser()).isPresent()) {
			return getDayInfo(in.getUser(), newDate);
		} else {
			throw new NoSuchDaysException("Дальше нельзя");
		}
	}

	public DailyInfo getDayInfo(User user, Date date) {
		Optional<Day> dayOpt = getActualDay(date, user);
		Day day;
		day = dayOpt.orElse(new Day(user));
		save(day);
		return new DailyInfo(day, user, Calculator.calculateEatenFeatures(day.getDishes()));
	}

	public Optional<Day> getActualDay(Date date, User user) {
		List<Day> days = findByDate(date, user.getId()).orElse((List<Day>) new ArrayList<Day>());
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Optional<Day> dayOpt = days.stream()
				.filter(d -> dateFormat.format(d.getDate()).equalsIgnoreCase(dateFormat.format(date))).findFirst();
		return dayOpt;
	}

	public void save(Day day) {
		try {
			this.repository.save(day);
		} catch (Exception e) {
			update(day);
		}
	}

	public void findByDate(Date date) {
		this.repository.findByDate(date);
	}

	public Optional<Day> findById(long id) {
		return this.repository.findById(id);
	}

	public void update(Day day) {
		try {
			this.repository.deleteById(day.getId());
			this.repository.save(day);
		} catch (Exception e) {
			this.repository.save(day);
		}
	}

	public DayRepository getRepository() {
		return repository;
	}

	public void setRepository(DayRepository repository) {
		this.repository = repository;
	}

}
