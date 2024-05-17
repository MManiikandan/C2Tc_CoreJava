package com.mmanikandan.assignment1.employees;

public class Empolyee {
     private String name;
     private int employeeId;
     private double salary;
     private  static int totalEmployees=0;
     
	/**
	 * @param name
	 * @param employeeId
	 * @param salary
	 */
	public Empolyee(String name, int employeeId, double salary) {
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
		totalEmployees=totalEmployees+1;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the totalEmployees
	 */
	public static int getTotalEmployee() {
		return totalEmployees;
	}
}
