package com.mmanikandan.assignment6;
import java.util.ArrayList;
import java.util.Scanner;
public class AssignmentMain {
	static ArrayList<BankAccount> useraccounts=new ArrayList<BankAccount>();
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		useraccounts.add(new BankAccount(100,5000));
		useraccounts.add(new BankAccount(101,5000));
		useraccounts.add(new BankAccount(102,5000));
		useraccounts.add(new BankAccount(103,5000));
		System.out.println("Enter the Account no: ");
		int acc=input.nextInt();
		boolean validAccount=false;
		for(BankAccount user:useraccounts) {
			if(user.getAccountNumber()==acc) {
				System.out.println("1.Deposit \n2.withdraw \nEnter the option: ");
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
						System.out.println(e.handleException());
					}
					finally {
						input.close();
						validAccount=!validAccount;
					}
				}
				else if(userOpt==2) {
					System.out.println("Enter the withdraw ammount: ");	
					double ammount=input.nextDouble();
					try {
						if(ammount<=0) {
							throw new InvalidAmountException();
						}
						try {
							System.out.println(user.withdrawal(ammount));
						} catch (InsufficientFundsException e) {
							System.out.println(e.handleException()
									          +user.getBalance());
						} 	
					}
				  catch(InvalidAmountException e) {
						System.out.println(e.handleException());
				  }
				  finally {
						input.close();
						validAccount=!validAccount;
				  }
				}
				else {
					System.out.println("Invalid choice ");
					input.close();
					System.exit(0);
				}
			}
			
			
		}
		if(!validAccount) {
			input.close();
			System.out.println("Invalid account......");
		}
		
	}

}

