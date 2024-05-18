package com.mmanikandan.assignment5;

import java.util.Scanner;

public class AssignmentMain {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the customer name : ");
		String name=input.nextLine();
		System.out.println("Enter the Stage Event : ");
		String stageEvent=input.nextLine();
		System.out.println("Enter the number of seats: ");
		int noOfSeats=input.nextInt();
	    TicketBooking ticket=new TicketBooking(name, stageEvent, noOfSeats);
		System.out.println("1.Cash payment /n2.Wallet payment /n3.Credit card /nEnter the option: ");
		int userOpt=input.nextInt();
		input.nextLine();
		if(userOpt==1) {
		   System.out.println("Enter the payment ammount : ");
		   Double ammount=input.nextDouble();
		   ticket.makepayment(Double.parseDouble(String.format("%.1f", ammount)));
		}
		else if(userOpt==2) {
		    System.out.println("Enter the payment ammount : ");
		    Double ammount=input.nextDouble();
		    input.nextLine();
			System.out.println("Enter the walletNumber: ");
			String walletNumber=input.nextLine();
			ticket.makepayment(walletNumber,Double.parseDouble(String.format("%.1f", ammount)));
		}
		else if(userOpt==3) {
		    System.out.println("Enter the payment ammount : ");
		    Double ammount=input.nextDouble();
		    input.nextLine();
			System.out.println("Enter the holder name : ");
			String holderName=input.nextLine();
			System.out.println("Enter the type of credit Card : ");
			String creditCard=input.nextLine();
			System.out.println("Enter the ccv : ");
			String ccv=input.nextLine();
			ticket.makepayment(creditCard,ccv,holderName,Double.parseDouble(String.format("%.1f",ammount)));
		}
		else {
			System.out.println("Invalid choice ............");
			System.exit(0);
		}
		
		
	}

}
