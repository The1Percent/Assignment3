/**
 * JUnit test for testing the BankAccount class
 */
package test;

import core.BankAccount;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Shane Thoney
 * @version 1.0
 */
public class BankAccountTest {
	
	public static BankAccount savAccount;
	public static BankAccount checkAccount;
	public static BankAccount awardAccount;
	public static BankAccount creditAccount;
	
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
		savAccount = new BankAccount("111111", "John TheSaver", 1000.0, 1);
		awardAccount = new BankAccount("22222", "Sue SavesALot", 2000.0, 2);
		checkAccount = new BankAccount("3333333", "Paul PaysBills", 500.0, 3);
		creditAccount = new BankAccount("4444", "Peter PaysInterest", 3000.0, 4);

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		savAccount = new BankAccount();
		awardAccount = new BankAccount();
		checkAccount = new BankAccount();
		creditAccount = new BankAccount();
	}

	/**
	 * Test method for {@link core.BankAccount#getInterestRate()}.
	 */
	@Test
	public final void testGetInterestRate() {
		assertTrue("Savings Account rate issue", (savAccount.getInterestRate()) > 0);
		assertTrue("Award Savings Account rate issue", (awardAccount.getInterestRate()) > 0);
		assertTrue("Checking Account rate issue", (checkAccount.getInterestRate()) > 0);
		assertTrue("Credit Account rate issue", (creditAccount.getInterestRate()) > 0);
	}


	/**
	 * Test method for {@link core.BankAccount#calculateTotalBalance()}.
	 */
	@Test
	public final void testCalculateTotalBalance() {
		double savExpectedBalance = savAccount.getBalance() + (savAccount.getBalance() * savAccount.getInterestRate() * 0.01);
		double awardExpectedBalance = awardAccount.getBalance() + (awardAccount.getBalance() * awardAccount.getInterestRate() * 0.01);
		double checkExpectedBalance = checkAccount.getBalance() + (checkAccount.getBalance() * checkAccount.getInterestRate() * 0.01);
		double creditExpectedBalance = creditAccount.getBalance() + (creditAccount.getBalance() * creditAccount.getInterestRate() * 0.01);
		assertTrue("Saving Expected balance does not match", savAccount.calculateTotalBalance() == savExpectedBalance);
		assertTrue("Award Savings Expected balance does not match", awardAccount.calculateTotalBalance() == awardExpectedBalance);
		assertTrue("Checking Expected balance does not match", checkAccount.calculateTotalBalance() == checkExpectedBalance);
		assertTrue("Credit Expected balance does not match", creditAccount.calculateTotalBalance() == creditExpectedBalance);

	}

}
