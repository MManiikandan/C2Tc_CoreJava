package com.mmanikandan.assignment5;

public class TicketBooking {
     private String stageEvent;
     private String customer;
     private int noOfSeats;
	
	public TicketBooking() {
		
	}

	/**
	 * @param stageEvent
	 * @param customer
	 * @param noOfSeats
	 */
	public TicketBooking(String stageEvent, String customer, int noOfSeats) {
		
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}
	public void makepayment(Double ammount) {
		System.out.println("Stage Event : "+this.stageEvent);
		System.out.println("Customer :"+this.customer);
		System.out.println("Number of seats :"+this.noOfSeats);
		System.out.println("Ammount "+ammount+" paid in cash");
	}
	public void makepayment(String walletNumber,Double ammount) {
		System.out.println("Stage Event: "+this.stageEvent);
		System.out.println("Customer : "+this.customer);
		System.out.println("Number of seats: "+this.noOfSeats);
		System.out.println("Ammount "+ammount+" paid using wallet number "+walletNumber);	
	}
	public void makepayment(String creditcard,String ccv,String holderName,Double ammount) {
		System.out.println("Stage Event: "+this.stageEvent);
		System.out.println("Customer : "+this.customer);
		System.out.println("Number of seats: "+this.noOfSeats);
		System.out.println("Holder Name : "+holderName);
		System.out.println("Ammount "+ammount+" paid using"+creditcard +"card");	
		System.out.println("CCV: "+ccv);
	}

	/**
	 * @return the stageEvent
	 */
	public String getStageEvent() {
		return stageEvent;
	}

	/**
	 * @param stageEvent the stageEvent to set
	 */
	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}

	/**
	 * @return the customer
	 */
	public String getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	/**
	 * @return the noOfSeats
	 */
	public int getNoOfSeats() {
		return noOfSeats;
	}

	/**
	 * @param noOfSeats the noOfSeats to set
	 */
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
     
}
