/**
 * JUnit test for testing the customer class
 */
package test;

import static org.junit.Assert.*;
import core.Customer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Shane Thoney
 * @version 1.0
 */
public class CustomerTest {

	protected Customer testCustomer;
	protected String name = "John Doe";
	protected String street = "555 Simpson Drive";
	protected String city = "Palo Alto";
	protected String state = "CA";
	protected String zip = "91777";
	protected int age = 50;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		testCustomer = new Customer(name, street, city, state, zip, age);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		testCustomer = null;
	}

	/**
	 * Test method for {@link core.Customer#displayAddress()}.
	 */
	@Test
	public final void testDisplayAddress() {
		String dispAddress = street + ", " + city + ", " + state + ", " + zip;
		assertTrue("Display address does not match expected result", testCustomer.displayAddress().equals(dispAddress));
	}
	/**
	 * Test method for {@link core.Customer#displayAddressLabel()}.
	 */
	@Test
	public final void testDisplayAddressLabel() {
		String addressLabel = name + ", " + street + ", " + city + ", " + state + " " + zip;
		assertTrue("Address label does not match expected result", testCustomer.displayAddressLabel().equals(addressLabel));
	}

}
