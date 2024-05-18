
package com.mmanikandan.assignment6;

import java.util.InputMismatchException;

/**
 * 
 */
@SuppressWarnings("serial")
public class InvalidAmountException extends InputMismatchException {
	public String exception() {
		  return new String("Invalid ammount: Ammount can't be negative ");
	  }
}
