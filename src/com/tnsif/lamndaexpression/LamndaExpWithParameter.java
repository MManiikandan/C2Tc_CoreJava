package com.tnsif.lamndaexpression;

public class LamndaExpWithParameter {

	public static void main(String[] args) {
		Message m1=(name)->{
		   return name;
		};
       System.out.println("hello "+m1.greet("Sivalingam"));
	}
}
