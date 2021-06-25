package in.mani.exception;

public class ValidationException extends RuntimeException {

	/**
	 * This Exception is for Invalid Details
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method will throw the exception for Invalid Inputs
	 * 
	 * @param message
	 */
	public ValidationException(String message) {
		super(message);
	}

}
