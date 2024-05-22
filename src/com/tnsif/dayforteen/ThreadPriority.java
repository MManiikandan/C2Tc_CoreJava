package com.tnsif.dayforteen;
class Threads extends Thread{
	synchronized public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i =0;i<10; i++ ) {
			 try{	
				 sleep(2000);
			 }catch(Exception e){
				 System.out.println(e);
			 }
	 	    	System.out.println(i);
	 	}
		System.out.println(Thread.currentThread().getPriority());
	}
}
public class ThreadPriority extends Thread {
    public static void main(String args[]) throws InterruptedException {
    	Threads t1=new Threads();
    	t1.start();
    	t1.setPriority(5);
    	t1.setName("jp");
    	try {
    		 sleep(2000);
		 }catch(Exception e){
			 System.out.println(e);
		 }
    	System.out.println(Thread.currentThread());	
    }
}
