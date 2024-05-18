package com.mmanikandan.assignment4;

public class AirIndia implements Airfare{
    private int hours;
    private double costPerHour;
    
	/**
	 * @param hours
	 * @param costPerHour
	 */
	public AirIndia(int hours, double costPerHour) {
		this();
		this.hours = hours;
		this.costPerHour = costPerHour;
	}
	

	/**
	 * 
	 */
	public AirIndia() {
		System.out.println("This is AirIndia..");	
	}
	@Override
	public Double calculateAmmount() {
//		return Double.parseDouble(String.format("%.2f", this.hours*this.costPerHour));
		return this.hours*this.costPerHour;
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	/**
	 * @return the costPerHour
	 */
	public double getCostPerHour() {
		return costPerHour;
	}

	/**
	 * @param costPerHour the costPerHour to set
	 */
	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}
	

}
