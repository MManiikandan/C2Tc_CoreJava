
package com.mmanikandan.assignment4;

/**
 * 
 */
public class Indigo implements Airfare {
	    private int hours;
	    private double costPerHour;
		public  Indigo() {
			System.out.println("This is Indigo..");
		}
		/**
		 * @param hours
		 * @param costPerHour
		 */
		public  Indigo(int hours, double costPerHour) {
			this();
			this.hours = hours;
			this.costPerHour = costPerHour;
		}

		@Override
		public Double calculateAmmount() {
			return  (this.hours*this.costPerHour)*8;
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
