package com.tnsif.thirdteen;

public class Main {
    /*
     * It thread concernly worked
     */
	public static void main(String[] args) {
		System.out.println("It main method...");
		ThreadTest thred=new ThreadTest();
		ThreadRunnanleInterface thread1=new ThreadRunnanleInterface();
		Thread t1=new Thread(thred);
		Thread t2=new Thread(thread1);
		t2.start();
		t1.start();
		System.out.println("Ending....."); 
		
	}

}
