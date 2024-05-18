package com.mmanikandan.assignment6;

/**
 * 
 */
public class BankAccount {
    private int accountNumber;
    private double balance;
	/**
	 * @param accountNumber
	 * @param balance
	 */
	public BankAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String deposit(double ammount) {
		this.balance=this.balance+ammount;
		return new String("Deposit the ammount :"+ammount+" succesfully... ");
	}

	public String withdrawal(double ammount) {
		try {
			if(this.balance<ammount) {
			    throw new InsufficientFundsException();
			}
		}
		catch(InsufficientFundsException e) {
			return new String(e.exception()+this.getBalance());
		}
		this.balance=this.balance-ammount;
		return new String("Withdrawal the ammount "+ammount +" succesfully... ");
	}
	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
     
}
