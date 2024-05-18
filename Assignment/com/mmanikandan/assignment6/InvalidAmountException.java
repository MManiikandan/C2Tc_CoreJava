package com.mmanikandan.assignment6;

@SuppressWarnings("serial")
public class InvalidAmountException extends Exception {
	
	public String exception() {
		  return new String("Invalid ammount: Ammount can't be negative ");
	  }
	
}
