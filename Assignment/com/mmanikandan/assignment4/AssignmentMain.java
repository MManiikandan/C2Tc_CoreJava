package com.mmanikandan.assignment4;
import java.util.*;
public class AssignmentMain {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		    System.out.println("1.AirIndia \n2.KingFisher \n3.Indigo \n4.Exit \nEnter option: ");
		    int userOption=input.nextInt();
			if(userOption==1) {
				System.out.println("Enter the hours of travel : ");
			    int hours=input.nextInt();
			    System.out.println("Enter the  CostPerHour: ");
			    double costPerHour=input.nextDouble();
			    Airfare airindia=new AirIndia(hours,costPerHour);
				System.out.printf("The total ammount : %.2f%n",airindia.calculateAmmount());
			    
			}
			else if(userOption==2) {
				System.out.println("Enter the hours of travel : ");
			    int hours=input.nextInt();
			    System.out.println("Enter the  CostPerHour: ");
			    double costPerHour=input.nextDouble();
			    Airfare kingfisher=new KingFisher(hours,costPerHour);
				System.out.printf("The total ammount : %.2f%n",kingfisher.calculateAmmount());
			}
			else if(userOption==3) {
				System.out.println("Enter the hours of travel : ");
			    int hours=input.nextInt();
			    System.out.println("Enter the  CostPerHour: ");
			    double costPerHour=input.nextDouble();
			    Airfare indigo=new Indigo(hours,costPerHour);
				System.out.printf("The total ammount : %.2f%n",indigo.calculateAmmount());
			}
			else {
				System.exit(0);
		    }
	}

}
