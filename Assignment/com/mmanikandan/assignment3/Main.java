
package com.mmanikandan.assignment3;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		new SavingsAccount("Manikandan.R","1234");
		new SavingsAccount("Marees.C","1235");
		new SavingsAccount("Sivalingam.J","1236");
		new SavingsAccount("Sivalingam.S","1237");
		new SavingsAccount("Manikandan.M","1238");
		new CheckingAccount("Antont.P","1239");
		new CheckingAccount("Naga.M","1240");
//		System.out.println("Total account : "+Bank.getTotalAccounts());
//	    for(Account user:Account.users) {
//	    	System.out.println(user.getAccNo());
//	    }
		int userOpt;
		long accno;
		String password;
		Scanner input=new Scanner(System.in);
		System.out.println("................................................");
		System.out.println("Enter 1 to withdraw the ammount");
		System.out.println("Enter 2 to deposite the ammount");
		System.out.println("Enter 3 to transaction to the ammount");
		System.out.println("Enter 4 to check the Accountbalance");
		System.out.println("Enter 5 to Exit");
		System.out.println("................................................");
		System.out.println("Enter the Account number: ");
		boolean validac=false;
		accno=input.nextLong();
		input.nextLine();
		System.out.println("Enter the pin: ");
		password=input.nextLine();
		for(Account user:Account.users) {
             if(user.getAccNo()==accno && user.getPin().equals(password)) {
            	   validac=!validac;
            		while(true) {
            			System.out.println("Enter the option");
            			userOpt=input.nextInt();
            			switch(userOpt) {
            			case 1:
            				user.withdraw();
            				break;
            			case 2:
            				user.deposit();
            				break;
            			case 3:
            				new Transaction(user);
            				break;
            			case 4:
            				System.out.println( user.getAccBalance());
            				break;
            			case 5:
            				System.exit(0);
            				break;
            			
            			default:
            				System.exit(0);
            			}
            		}
            	}
            
		}
      if(!validac) {
    	  System.out.println("Invalid Accno or password");
      }
	}

}
