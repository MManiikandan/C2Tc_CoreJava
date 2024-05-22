package com.tnsif.thirdteen;

public class ThreadRunnanleInterface implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("thred is running");
			
		}
	
	}

}
