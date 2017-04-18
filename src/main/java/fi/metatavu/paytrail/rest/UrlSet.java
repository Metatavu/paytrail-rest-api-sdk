package fi.metatavu.paytrail.rest;

public class UrlSet {
	
	public UrlSet() {
	}
	
	public UrlSet(String success, String failure, String notification, String pending) {
		super();
		this.success = success;
		this.failure = failure;
		this.pending = pending;
		this.notification = notification;
	}

	/**
	 * Returns an IP address to which user is directed after a successful payment to Paytrail. 
	 * 
	 * @return IP address to which user is directed after a successful payment to Paytrail. 
	 */
	public String getSuccess() {
		return success;
	}
	
	/**
	 * Sets IP address to which user is directed after a successful payment to Paytrail. 
	 * 
	 * @param success IP address to which user is directed after a successful payment to Paytrail.
	 */
	public void setSuccess(String success) {
		this.success = success;
	}
	
	/**
	 * Returns an IP address to user is directed after a cancelled or failed payment. 
	 * 
	 * @return IP address to user is directed after a cancelled or failed payment. 
	 */
	public String getFailure() {
		return failure;
	}
	
	/**
	 * Sets an IP address to user is directed after a cancelled or failed payment.
	 * 
	 * @param failure
	 */
	public void setFailure(String failure) {
		this.failure = failure;
	}
	
	/**
	 * Not in use. 
	 * 
	 * @return null
	 */
	public String getPending() {
		return pending;
	}
	
	/**
	 * Not in use. 
	 * 
	 * @param pending do not use
	 */
	public void setPending(String pending) {
		this.pending = pending;
	}
	
	/**
	 * Requested IP address when the payment is marked as successful. The address is requested with the same GET parameters as success address when the payment is made. Notification request is typically executed within a few minutes from the payment. 
	 * 
	 * @return Requested IP address when the payment is marked as successful
	 */
	public String getNotification() {
		return notification;
	}
	
	public void setNotification(String notification) {
		this.notification = notification;
	}
	
	private String success;
	private String failure;
	private String pending;
	private String notification;
}
