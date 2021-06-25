package in.mani.exception;

public class ServiceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * This method will throw the Service exception
	 * 
	 * @param message
	 */
	public ServiceException(String message) {
		super(message);
	}

}
