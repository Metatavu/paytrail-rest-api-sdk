package fi.metatavu.paytrail;

public class PaytrailException extends Exception {

	private static final long serialVersionUID = 1L;

	public PaytrailException(String message) {
		super(message);
	}
	
	public PaytrailException(Exception cause) {
		super(cause);
	}
	
}
