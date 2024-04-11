package com.tnsif.sample;
import  java.util.Scanner;
public class ProductDemo {
	public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     int num,lastdigit;
     int product=1;
     System.out.print("Enter the number: ");
     num=input.nextInt();
     while(num>0) {
    	 lastdigit=num%10;
    	 product=product*lastdigit;
    	 num=num/10;
     }
     System.out.print(product);
	}
	
     
}
