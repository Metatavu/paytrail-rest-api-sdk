package fi.metatavu.paytrail;

import java.io.IOException;
import java.io.Serializable;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import fi.metatavu.paytrail.io.IOHandler;
import fi.metatavu.paytrail.io.IOHandlerResult;
import fi.metatavu.paytrail.json.Marshaller;
import fi.metatavu.paytrail.rest.JsonError;
import fi.metatavu.paytrail.rest.OrderDetails;
import fi.metatavu.paytrail.rest.Payment;
import fi.metatavu.paytrail.rest.Product;
import fi.metatavu.paytrail.rest.Result;

public class PaytrailService implements Serializable {

	private static final long serialVersionUID = 3162475976498158463L;

	private final static String SERVICE_URL = "https://payment.paytrail.com";
	
	public PaytrailService(IOHandler ioHandler, Marshaller marshaller, String merchantId, String merchantSecret) {
		this(ioHandler, marshaller, merchantId, merchantSecret, SERVICE_URL);
	}
	
	public PaytrailService(IOHandler ioHandler, Marshaller marshaller, String merchantId, String merchantSecret, String serviceUrl) {
		this.ioHandler = ioHandler;
		this.marshaller = marshaller;
		this.merchantId = merchantId;
		this.merchantSecret = merchantSecret;
		this.serviceUrl = serviceUrl;
	}
	
	public Payment addProduct(Payment payment, String title, String code, Double amount, Double price, Double vat, Double discount, Integer type) throws PaytrailException {
		Product product = new Product(title, code, amount, price, vat, discount, type);
		OrderDetails orderDetails = payment.getOrderDetails();
		if (orderDetails == null) {
			throw new PaytrailException("orderDetails is null");
		}
		
		Product[] products = orderDetails.getProducts();
		if (products == null) {
			orderDetails.setProducts(new Product[] {
				product
			});
		} else {
			orderDetails.setProducts(ArrayUtils.add(products, product));
		}
		
		return payment;
	}
	
	/**
	 * Get url for payment
	 * 
	 * @param payment payment
	 * @return Result result
	 * @throws PaytrailException 
	 */
	public Result processPayment(Payment payment) throws PaytrailException {
		try {
			String data = marshaller.objectToString(payment);
			String url = serviceUrl + "/api-payment/create";
			
			IOHandlerResult requestResult = postJsonRequest(url, data);
			
			if (requestResult.getCode() != 201) {
				JsonError jsonError = marshaller.stringToObject(JsonError.class, requestResult.getResponse());
				throw new PaytrailException(jsonError.getErrorMessage());
	  	}
			
			Result result = marshaller.stringToObject(Result.class, requestResult.getResponse());
			return result;
		} catch (IOException e) {
			throw new PaytrailException(e);
		}
	}
	
	/**
	 * This function can be used to validate parameters returned by return and notify requests.
	 * Parameters must be validated in order to avoid hacking of payment confirmation.
	 
	 */
	public boolean confirmPayment(String orderNumber, String timestamp, String paid, String method, String authCode) {
		String base = new StringBuilder()
  	  .append(orderNumber)
  	  .append('|')
  	  .append(timestamp)
  	  .append('|')
  	  .append(paid)
  	  .append('|')
  	  .append(method)
  	  .append('|')
  	  .append(merchantSecret)
  	  .toString();
		
		return 
			StringUtils.equals(
				StringUtils.upperCase(DigestUtils.md5Hex(base)),
				authCode
			);
	}

	/**
	 * This function can be used to validate parameters returned by failure request.
	 * Parameters must be validated in order to avoid hacking of payment failure.
	 
	 */
	public boolean confirmFailure(String orderNumber, String timestamp, String authCode) {
		String base = new StringBuilder()
  	  .append(orderNumber)
  	  .append('|')
  	  .append(timestamp)
  	  .append('|')
  	  .append(merchantSecret)
  	  .toString();
		
		return 
			StringUtils.equals(
				StringUtils.upperCase(DigestUtils.md5Hex(base)),
				authCode
			);
	}
	
	private IOHandlerResult postJsonRequest(String url, String data) throws IOException {
		return ioHandler.doPost(merchantId, merchantSecret, url, data);
	}

	private Marshaller marshaller;
	private IOHandler ioHandler;
	private String merchantId;
	private String merchantSecret;
	private String serviceUrl;
}
