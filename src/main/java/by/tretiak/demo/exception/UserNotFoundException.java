package by.tretiak.demo.exception;

public class UserNotFoundException extends Exception{

	private static final long serialVersionUID = -2313175316815897447L;
	
	public String message;
	
	public UserNotFoundException() {
		this.message = "not found";
	}
	
	public UserNotFoundException(String message) {
		this.message = message;
	}

}
