package fi.metatavu.paytrail.rest;

public class Product {

	public static final int TYPE_NORMAL = 1;
	public static final int TYPE_POSTAL = 2;
	public static final int TYPE_HANDLING = 3;
	
	public Product() {
	}
	
	public Product(String title, String code, Double amount, Double price, Double vat, Double discount, Integer type) {
		super();
		this.title = title;
		this.code = code;
		this.amount = amount;
		this.price = price;
		this.vat = vat;
		this.discount = discount;
		this.type = type;
	}

	/**
	 * Product name in free format. The product title is shown in the Merchant's Panel and on Klarna service invoices on a product row. Product details are shown also on the payment method selection page. 
	 * 
	 * @return product's title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets product's title
	 * 
	 * @param title product's title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Optional product number. Using a product number may help in aligning a correct product. 
	 * 
	 * @return product's number
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets product's number
	 * 
	 * @param code product's number
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * If an order consists of several samples of the same product, you can enter the number of products here and there won't be a need for adding each product as a separate row. Usually this field contains value 1. 
	 * 
	 * @return amount of products
	 */
	public Double getAmount() {
		return amount;
	}
	
	/**
	 * Sets amount of products
	 * 
	 * @param amount amount of products
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	/**
	 * Returns a price for one product. If the field payment->orderDetails->includeVat = 0, this is a price excluding VAT. If the value is 1, this is a price including VAT. The price can also be negative if you want to add discounts to the service. However, the total amount of the product rows must always be bigger than 0. 
	 * 
	 * @return price for one product
	 */
	public Double getPrice() {
		return price;
	}
	
	/**
	 * Sets price for one product
	 * 
	 * @param price price for one product
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	
	/**
	 * Returns tax percentage for a product. The value added tax in Finland for most products is 23. 
	 * 
	 * @return tax percentage for a product
	 */
	public Double getVat() {
		return vat;
	}
	
	/**
	 * Sets tax percentage for a product
	 * 
	 * @param vat tax percentage for a product
	 */
	public void setVat(Double vat) {
		this.vat = vat;
	}
	
	/**
	 * If you have reduced the product price, you can show the discount percentage as a figure between 0 and 100 in this field. Default discount value is 0. 
	 * 
	 * @return discount percentage
	 */
	public Double getDiscount() {
		return discount;
	}
	
	/**
	 * Sets discount percentage
	 *  
	 * @param discount discount percentage
	 */
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	/**
	 * A type can be specified for the product row. Type 1 refers to a normal product row. Value 2 can be used for postage and value 3 for processing costs. Value 1 can be used for all rows, but postage and processing costs cannot be differentiated from other rows to the invoice. Default value for the field is 1. 
	 * 
	 * @return type of product
	 */
	public Integer getType() {
		return type;
	}
	
	/**
	 * Sets type of product
	 * 
	 * @param type type of product
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	
	private String title;
	private String code;
	private Double amount;
	private Double price;
	private Double vat;
	private Double discount;
	private Integer type;
}
