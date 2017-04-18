package fi.metatavu.paytrail.rest;

/**
 * This object is returned when a payment is processed to Paytrail It allows you to query for token or url
 */
public class Result {

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	private String orderNumber;
	private String token;
	private String url;
}
