/**
 * This class is for the definition of BankAccount objects.    
 */
package core;

/**
 * @author Shane Thoney
 * @version 1.0 
 */
public class BankAccount {
	String accountNumber;
	String accountHolder;
	double balance;
	int accountType;
	
	/**
	 * Default Constructor
	 */
	public BankAccount() {
		super();
		this.accountNumber = "none";
		this.accountHolder = "Unknown";
		this.balance = 0;
		this.accountType = 0;
	}
	
	/**
	 * @param accountNumber Number associated with the account
	 * @param accountHolder Name of the account holder
	 * @param balance Current Balance
	 * @param accountType Defines the type of account. 1: Savings, 2: Award Savers, 3: Checking, or 4: Credit Card
	 */
	public BankAccount(String accountNumber, String accountHolder, double balance, int accountType) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.accountType = accountType;
	}

	
	/**
	 * @return Returns the account number for this object
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber updates the account number from this object to the String provided
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return Returns the name of the account holder
	 */
	public String getAccountHolder() {
		return accountHolder;
	}

	/**
	 * @param accountHolder Updates the account holder name with the string provided
	 */
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	/**
	 * @return Returns the balance on the BankAccount object
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance Updates the balance of the account with the number provided
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return Returns and integer specifying the account type 1: Savings, 2: Award Savers, 3: Checking, or 4: Credit Card
	 */
	public int getAccountType() {
		return accountType;
	}
	
	/**
	 * @param accountType Updates the account type field for the account 1: Savings, 2: Award Savers, 3: Checking, or 4: Credit Card
	 */
	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}
	/**
	 * @return Returns the current interest rate.  Note if zero is returned, likely means the accountType is not defined or is improperly defined for this account
	 */
	public double getInterestRate() {
		double rate;
		switch (this.accountType) {
			case 1: rate = 0.5;
				break;
			case 2: rate = 4.5;
				break;
			case 3: rate = 1.0;
				break;
			case 4: rate = 15.0;
				break;
			default: rate = 0.0;
		}
		return rate;
	}
	/**
	 * @return  Returns the total balance after interest is applied.
	 */
	public double calculateTotalBalance() {
		double totalBalance = this.balance + (this.balance * getInterestRate() * 0.01);
		return totalBalance;
	}
	
	
}
