package by.jonline.basicsofoop.task4.service;

public class ServiceException extends Exception {

	private static final long serialVersionUID = 4843099001493012811L;

	public ServiceException() {
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

}
