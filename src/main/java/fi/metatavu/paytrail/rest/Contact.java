package fi.metatavu.paytrail.rest;

public class Contact {

  private String firstName;
  private String lastName;
  private String companyName;
  private String email;
  private String telephone;
  private String mobile;
  private Address address;
	
	public Contact() {
    // Zero-argument constructor
	}
	
	public Contact(String firstName, String lastName, String email, Address address, String telephone, String mobile, String companyName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.email = email;
		this.telephone = telephone;
		this.mobile = mobile;
		this.address = address;
	}

	/**
	 * Returns payer's first name. 
	 * 
	 * @return Payer's first name. 
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets payer's first name.
	 * 
	 * @param firstName payer's first name.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns payer's surname. 
	 * 
	 * @return payer's surname. 
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets payer's surname. 
	 * 
	 * @param lastName payer's surname
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns a company name
	 * 
	 * @return a company name
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * Sets a company name
	 * 
	 * @param companyName a company name
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * Returns payer's email address. 
	 * 
	 * @return payer's email address. 
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets payer's email address
	 * 
	 * @param email payer's email address
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Returns payer's telephone number. 
	 * 
	 * @return payer's telephone number. 
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * Sets payer's telephone number. 
	 * 
	 * @param telephone payer's telephone number. 
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * Returns payer's mobile number. 
	 * 
	 * @return payer's mobile number. 
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * Sets payer's mobile number. 
	 * 
	 * @param mobile payer's mobile number. 
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * Returns payer's address 
	 * 
	 * @return payer's address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Sets payer's address
	 * 
	 * @param address payer's address
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
}
