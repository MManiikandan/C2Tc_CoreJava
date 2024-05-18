package com.mmanikandan.assignment6;

@SuppressWarnings("serial")
public class InsufficientFundsException extends Exception {
  public String handleException() {
	  return new String("Your account balance is low ");
  }
}
