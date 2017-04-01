/**
 * This is the Customer class.  It is used to collect and store the name, age, and address of a customer
 */
package core;

/**
 * @author Shane Thoney
 * @version 1.0
 *
 */
public class Customer {
	String name;
	String streetAddress;
	String city;
	String zip;
	String state;
	int age;
	
	
	/**
	 * Default Constructor
	 */
	public Customer() {
		super();
		this.name = "";
		this.streetAddress = "";
		this.city = "";
		this.state = "";
		this.zip = "";
		this.age = 0;
	}
	
	
	/**
	 * @param name Customer Name
	 * @param streetAddress Street Address (IE 555 Westfield Rd.)
	 * @param city What city does the customer live in
	 * @param state What state does the customer live in (consider update if international customers are expected)
	 * @param zip Zip code of the customers address
	 * @param age How old is the customer
	 */
	public Customer(String name, String streetAddress, String city, String state, String zip, int age) {
		super();
		this.name = name;
		this.streetAddress = streetAddress;
		this.city = city;
		this.zip = zip;
		this.age = age;
		this.state = state;
	}


	/**
	 * @return Returns customer name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name Updates customer name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return returns customers street address
	 */
	public String getStreetAddress() {
		return streetAddress;
	}
	/**
	 * @param streetAddress updates customer street address with provided string
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	/**
	 * @return Returns the city the customer lives in
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city Updates the customer record for the city field
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return Returns the zip code
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @param zip Updates the zip code
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	/**
	 * @return Gets the age of the customer
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age Updates the customer age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @return Returns a string containing the customers address minus the name.  Comma delimited.
	 */
	public String displayAddress() {
		String address = this.streetAddress + ", " + this.city + ", " + this.state + ", " + this.zip;
		return address;
	}
	
	/**
	 * @return Returns the full mailing address.  Comma delimited
	 */
	public String displayAddressLabel() {
		String address = this.name + ", " + this.streetAddress + ", " + this.city + ", " + this.state + " " + this.zip;
		return address;
	}
}
;