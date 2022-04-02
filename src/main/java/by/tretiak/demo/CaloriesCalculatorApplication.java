package by.tretiak.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CaloriesCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaloriesCalculatorApplication.class, args);
	}

}
