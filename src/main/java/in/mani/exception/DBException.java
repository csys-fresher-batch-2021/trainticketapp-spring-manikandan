package in.mani.exception;

public class DBException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * This method will throw the Service exception
	 * 
	 * @param message
	 */
	public DBException(String message) {
		super(message);
	}

}
