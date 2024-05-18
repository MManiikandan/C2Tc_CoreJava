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
		System.out.printf("Ammount %.1f%n",ammount,"paid in cash");
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
