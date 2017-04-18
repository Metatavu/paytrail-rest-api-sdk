package fi.metatavu.paytrail.rest;

public class Address {

  private String street;
  private String postalCode;
  private String postalOffice;
  private String country;
	
	public Address() {
	  // Zero-argument constructor
	}
	
	public Address(String street, String postalCode, String postalOffice, String country) {
		super();
		this.street = street;
		this.postalCode = postalCode;
		this.postalOffice = postalOffice;
		this.country = country;
	}

	/**
	 * Returns payer's street address. 
	 * 
	 * @return payer's street address.
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Sets payer's street address.
	 * 
	 * @param street payer's street address.
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * Returns payer's postal code. 
	 * 
	 * @return payer's postal code
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Sets payer's postal code
	 * 
	 * @param postalCode payer's postal code
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * Returns payer's postal office
	 * 
	 * @return payer's postal office
	 */
	public String getPostalOffice() {
		return postalOffice;
	}

	/**
	 * Sets payer's postal office
	 * 
	 * @param postalOffice payer's postal office
	 */
	public void setPostalOffice(String postalOffice) {
		this.postalOffice = postalOffice;
	}

	/**
	 * Returns payer's country. The data are sent as a two-numbered character string in ISO-3166-1 standard format. For example, Finnish is FI and Swedish SE. The data are used for verifying credit history, and is thus required. 
	 * 
	 * @return payer's country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets payer's country
	 * 
	 * @param country payer's country
	 */
	public void setCountry(String country) {
		this.country = country;
	}
}
