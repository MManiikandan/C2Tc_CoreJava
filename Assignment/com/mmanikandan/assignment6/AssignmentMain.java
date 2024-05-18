package com.mmanikandan.assignment6;
import java.util.ArrayList;
import java.util.Scanner;
public class AssignmentMain {
	static Scanner input=new Scanner(System.in);
	static ArrayList<BankAccount> useraccounts=new ArrayList<BankAccount>();
	public static void main(String[] args) {
		useraccounts.add(new BankAccount(100,5000));
		useraccounts.add(new BankAccount(101,5000));
		useraccounts.add(new BankAccount(102,5000));
		useraccounts.add(new BankAccount(103,5000));
		System.out.println("Enter the Account no: ");
		int acc=input.nextInt();
		for(BankAccount user:useraccounts) {
			if(user.getAccountNumber()==acc) {
				System.out.println("1.Deposit \n2.withdraw Enter the option: ");
				int userOpt=input.nextInt();
				if(userOpt==1) {
					System.out.println("Enter the Deposit ammount: ");			
					try {
						double ammount=input.nextDouble();
						if(ammount<=0) {
							throw new InvalidAmountException();
						}
						System.out.println(user.deposit(ammount)); 	
					}
					catch(InvalidAmountException e) {
						System.out.println(e.exception());
					}
				}
				else if(userOpt==2) {
					System.out.println("Enter the withdraw ammount: ");			
					try {
						double ammount=input.nextDouble();
						if(ammount<=0) {
							throw new InvalidAmountException();
						}
						System.out.println(user.withdrawal(ammount)); 	
					}
					catch(InvalidAmountException e) {
						System.out.println(e.exception());
					}
				}
				else {
					System.out.println("Invalid choice ");
					System.exit(0);
				}
			}
		}
	}

}
