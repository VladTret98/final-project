package by.tretiak.demo.exception;

public class NoSuchDaysException extends Exception {

	private static final long serialVersionUID = 1L;
	public String message;

	public NoSuchDaysException() {
		super("Невозможно совершить");
		message = "Невозможно совершить";
	}

	public NoSuchDaysException(String e) {
		super(e);
		this.message = e;
	}

}
