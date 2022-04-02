package by.tretiak.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import by.tretiak.demo.exception.NoSuchDaysException;
import by.tretiak.demo.model.DailyInfo;
import by.tretiak.demo.service.DayService;

@Controller
public class DayController {
	
	@Autowired
	private DayService service;
	
	@GetMapping("/next")
	public String getNext(HttpSession session) {
		if(session.getAttribute("dayException") != null) session.removeAttribute("dayException");
		DailyInfo info;
		try {
			info = this.service.getNextDay(session);
		} catch (NoSuchDaysException e) {
			session.setAttribute("dayException", e);
			return "mainpage";
		}
		session.removeAttribute("daysInfo");
		session.setAttribute("daysInfo", info);
		return "mainpage";
	}
	
	@GetMapping("/previous")
	public String getPrevious(HttpSession session) {
		if(session.getAttribute("dayException") != null) session.removeAttribute("dayException");
		DailyInfo info;
		try {
			info = this.service.getPreviousDay(session);
		} catch (NoSuchDaysException e) {
			session.setAttribute("dayException", e);
			return "mainpage";
		}
		session.removeAttribute("daysInfo");
		session.setAttribute("daysInfo", info);
		return "mainpage";
	}
	
}
