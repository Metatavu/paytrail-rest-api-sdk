package fi.foyt.paytrail.rest;


public class OrderDetails {
	
	public OrderDetails() {
	}
	
	public OrderDetails(Integer includeVat, Contact contact) {
		super();
		this.includeVat = includeVat;
		this.contact = contact;
	}

	/**
	 * VAT included -field shows if the product row prices include value added tax. Value 1 means that VAT is included in the shown price, and 0 that it will be added. Therefore, use 1, if the prices in your webshop include value added tax and 0 if the prices do not include value added tax. 
	 * 
	 * @return whether VAT is included
	 */
	public Integer getIncludeVat() {
		return includeVat;
	}

	/**
	 * Sets whether VAT is included
	 * 
	 * @param includeVat whether VAT is included
	 */
	public void setIncludeVat(Integer includeVat) {
		this.includeVat = includeVat;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	private Integer includeVat = 1;
	private Contact contact;
	private Product[] products;
}
