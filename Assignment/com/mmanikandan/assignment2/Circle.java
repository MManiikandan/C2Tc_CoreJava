package com.mmanikandan.assignment2;

import java.util.Scanner;

public class Circle {
	double radius;
	String colour;
    static final double  PI=3.14;
	static Scanner input=new Scanner(System.in);;
	public Circle(){
		System.out.println("Enter the radius for circle :");
		this.radius=input.nextDouble();
		input.nextLine();
		System.out.println("Enter the circle colour : ");
		this.colour=input.nextLine();
		
	}
	public double calculateArea() {
		return PI*(this.radius*this.radius);
	}
	
    @Override
	public String toString() {
		return "Circle [radius=" + radius + ", colour=" + colour + "]";
	}
	public static void main(String args[]) {
    	Circle c1=new Circle();
    	System.out.println(c1);
    	System.out.println("The given circle area is: "+c1.calculateArea());
    }
}
