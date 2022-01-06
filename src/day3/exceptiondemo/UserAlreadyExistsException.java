package day3.exceptiondemo;

public class UserAlreadyExistsException extends RuntimeException {
	public UserAlreadyExistsException() {
		// TODO Auto-generated constructor stub
	}
	public UserAlreadyExistsException(String s) {
		super(s);
	}
}
