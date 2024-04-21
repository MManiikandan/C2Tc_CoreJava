package com.tnsif.sample;

public class Finalmethod {
	Finalmethod(){
		System.out.println("This is the default constructor");
		
	}
	final int a=50;
	final void shows() {
		System.out.println(a);
	}
	
	     public static void main(String args[]) {
	    	 Finalmethod obj1=new Finalmethod();
	    	 obj1.shows();
	     }
	

}
