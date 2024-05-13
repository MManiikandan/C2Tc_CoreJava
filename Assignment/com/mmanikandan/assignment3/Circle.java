package com.mmanikandan.assignment3;

import java.util.Scanner;

public class Circle {
	 float radius;
     String color;
     Scanner in = new Scanner(System.in);
     public void getInput() 
     { 
    	 System.out.print("Radius : ");
    	 this.radius = in.nextFloat();
    	 System.out.print("Colour :");
         in.nextLine();
    	 this.color = in.nextLine();
     }
     
     public float calcArea() 
     {
    	 return 3.14f*radius*radius;
     }
}
