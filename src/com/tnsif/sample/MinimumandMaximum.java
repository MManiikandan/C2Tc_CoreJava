package com.tnsif.sample;

import java.util.Scanner;
public class MinimumandMaximum {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a and b: ");
//		input.nextLine();
		int a=input.nextInt();
		int b=input.nextInt();
		int result=a>b?a:b;
        System.out.print(result+" "+(a+b));
	}
}
