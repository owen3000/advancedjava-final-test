package prob05;

public class UserNotFoundException extends Exception {

	private static final long serialVersionUID = -3942358564351077760L;

	public UserNotFoundException() {
		
	}
	public UserNotFoundException(String messege) {
		super(messege);
	}
}
