package com.mmanikandan.assignment3;

public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Student stu = new Student(); 
		
		Commission com = new Commission();
		
		com.enterDetails(); //to accept details
        System.out.println(com.calculateCommission()); //calculate commission
        
        Circle cir = new Circle();
        cir.getInput();
        System.out.println(cir.calcArea());
	}

}
