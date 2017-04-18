package fi.metatavu.paytrail.rest;

/**
 * http://docs.paytrail.com/en/index-all.html#idp259088
 */
public class Payment {
  
  private String orderNumber;
  private String referenceNumber;
  private String description;
  private String currency;
  private String locale;
  private UrlSet urlSet;
  private OrderDetails orderDetails;
  private Double price;
  private String token;
  private String url;
	
	public Payment() {
	  // Zero-argument constructor
	}
	
	public Payment(String orderNumber, OrderDetails orderDetails, UrlSet urlSet) {
		this(orderNumber, orderDetails, urlSet, null, null, "EUR", "fi_FI", null, null, null);
	}
	
	@SuppressWarnings ("squid:S00107")
	public Payment(String orderNumber, OrderDetails orderDetails, UrlSet urlSet, String referenceNumber, 
			String description, String currency, String locale, Double price, String token, String url) {
		super();
		this.orderNumber = orderNumber;
		this.referenceNumber = referenceNumber;
		this.description = description;
		this.currency = currency;
		this.locale = locale;
		this.urlSet = urlSet;
		this.orderDetails = orderDetails;
		this.price = price;
		this.token = token;
		this.url = url;
	}

	/**
	 * Returns an order number. Order number is a string of characters identifying the customer's purchase and the used webshop software creates it. 
	 * 
	 * @return order number
	 */
	public String getOrderNumber() {
		return orderNumber;
	}
	
	/**
	 * Sets an order number
	 * 
	 * @param orderNumber order number
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	/**
	 * Returns a reference number. Reference number is sent to bank by default and is automatically created. In those payment methods that are used as an interface, this field can contain own reference number, which is sent to the bank service instead of the automatically generated reference number. 
	 * 
	 * @return reference number
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}
	
	/**
	 * Sets a reference number
	 * 
	 * @param referenceNumber reference number
	 */
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	
	/**
	 * Any data about the order in text format can be sent to the payment system. The most usual pieces of data are customer name and contact information and order product information. They are shown in the Merchant's Panel in payment details. 
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Sets a description
	 * 
	 * @param description description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Returns payment currency. Value must EUR for the Finnish banks, otherwise the payment will not be accepted. 
	 * 
	 * @return payment currency
	 */
	public String getCurrency() {
		return currency;
	}
	
	/**
	 * Sets payment currency
	 *  
	 * @param currency payment currency
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	/**
	 * Localisation defines default language for the payment method selection page and presentation format for the sums. Available localisations are "fi_FI" , "sv_SE" and "en_US". The default localisation is always “fi_FI”. 
	 * 
	 * @return locale
	 */
	public String getLocale() {
		return locale;
	}
	
	/**
	 * Sets a locale
	 * 
	 * @param locale locale
	 */
	public void setLocale(String locale) {
		this.locale = locale;
	}
	
	public UrlSet getUrlSet() {
		return urlSet;
	}
	
	public void setUrlSet(UrlSet urlSet) {
		this.urlSet = urlSet;
	}
	
	public OrderDetails getOrderDetails() {
		return orderDetails;
	}
	
	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	/**
	 * Returns payment total. Send either exact payment data (orderDetails) or the payment total to the service. If you send only the payment total price, (Klarna and Collector) invoice and instalment payment methods are available and order details cannot be shown in the Merchant's Panel. We recommend using orderDetails record whenever it is possible. 
	 * 
	 * @return payment total
	 */
	public Double getPrice() {
		return price;
	}
	
	/**
	 * Sets a price
	 * 
	 * @param price price
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	
	/**
	 * Token is 64 characters long, specifying identifier for the payment, which is valid for 7 days or until the payment has been made. Token is needed as such with the payment method selection page embedding. 
	 * 
	 * @return token
	 */
	public String getToken() {
		return token;
	}
	
	/**
	 * Sets a token
	 * 
	 * @param token token
	 */
	public void setToken(String token) {
		this.token = token;
	}
	
	/**
	 * URL address includes the address to which consumer is directed for making the payment. The URL address also includes the token, which is used as a payment identifier. 
	 * 
	 * @return url
	 */
	public String getUrl() {
		return url;
	}
	
	/**
	 * Sets url
	 * 
	 * @param url url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
}
