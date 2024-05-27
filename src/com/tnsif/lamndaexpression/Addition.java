package com.tnsif.lamndaexpression;

public class Addition {
	public static void main(String[] args) {
	
		Operation sum=(a,b,c)-> a+b+c;
		System.out.println(sum.add(5,10,6));
	}
}
