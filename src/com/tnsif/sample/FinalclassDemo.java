package com.tnsif.sample;
final class FinalClass{
	void show() {
		System.out.println("Final class can't be inherited");
	}
}

public class FinalclassDemo {
     public static void main(String args[]) {
    	 FinalClass ob=new FinalClass();
    	 ob.show();
     }
}
