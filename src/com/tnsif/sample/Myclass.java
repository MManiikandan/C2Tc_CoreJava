package com.tnsif.sample;

public class Myclass {
     private int section;
     private static int srNo;
     static {
    	 System.out.println("With in static block");
    	 srNo=1000;
     }
     Myclass(){
    	 System.out.println(" ");
    	 srNo++;
    	 section++;
     }
	@Override
	public String toString() {
		return "Myclass [Serial No="+srNo
				+ "section=" + section + "]";
	}
	
    static void display() {
    	System.out.println(srNo);
    }
    
}
