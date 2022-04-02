package by.tretiak.demo.repository;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import by.tretiak.demo.model.Day;

@Repository
public interface DayRepository extends JpaRepository<Day, Long>{

	
	public Collection<Day> findByDate(Date date);
	
	public Optional<List<Day>> findByUserId(Long id);  
	
}
