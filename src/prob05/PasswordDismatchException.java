package prob05;

public class PasswordDismatchException extends Exception {

	private static final long serialVersionUID = -548954845358129420L;

	public PasswordDismatchException() {
		
	}
	public PasswordDismatchException(String messege) {
		super(messege);
	}
}
