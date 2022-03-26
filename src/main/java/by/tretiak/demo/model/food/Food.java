package by.tretiak.demo.model.food;

import org.w3c.dom.css.Counter;

//@MappedSuperclass
public class Food {

	//@Transient
	private Counter counter;

	public Counter getCounter() {
		return counter;
	}

	public void setCounter(Counter counter) {
		this.counter = counter;
	}
	
	
	
}
