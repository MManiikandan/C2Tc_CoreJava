package com.mmanikandan.assignment3;
import java.util.ArrayList;
public abstract class Account {
	private static long tempno;
	static {
		tempno=1234567890;
	}
	static ArrayList<Account> users=new ArrayList<Account>();
	private long accNo;
	private String username;
	private String pin;
	private double accBalance;
    abstract void deposit();
    abstract void withdraw();
    abstract double  getBalance();
	/**
	 * @param username
	 * @param pin
	 */
	public Account(String username, String pin) {
		new Bank();
		this.username = username;
		this.pin = pin;
		this.accBalance=5000;
		this.accNo=tempno;
		users.add(this);
		tempno++;
		
	}
	/**
	 * @return the accNo
	 */
	public long getAccNo() {
		return accNo;
	}
	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the pin
	 */
	public String getPin() {
		return pin;
	}
	/**
	 * @param pin the pin to set
	 */
	public void setPin(String pin) {
		this.pin = pin;
	}
	/**
	 * @return the accBalance
	 */
	public double getAccBalance() {
		return accBalance;
	}
	/**
	 * @param accBalance the accBalance to set
	 */
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
    
 }