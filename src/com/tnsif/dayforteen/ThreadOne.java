package com.tnsif.dayforteen;
class ThreadTwo extends Thread{
	public void run() {
	 for(int i=0;i<5;i++) {
		 System.out.println(i);
		System.out.println("Inside the run method "+this.isAlive());
		try {
		  Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	}
}
public class ThreadOne {

	public static void main(String[] args) {
		ThreadTwo t1=new ThreadTwo();
		System.out.println(t1.isAlive());
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After start method "+t1.isAlive());
	}

}
