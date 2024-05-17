package com.mmanikandan.assignment1.employees;

public class Manager extends Empolyee {
	/**
	 * @param name
	 * @param employeeId
	 * @param salary
	 * @param bonous
	 * @param department
	 */
	public Manager(String name, int employeeId, double salary, 
			        double bonous,String department) {
		super(name, employeeId, salary);
		this.bonous = bonous;
		this.department = department;
	}

	private double bonous;
    private String department;

	/**
	 * @return the bonous
	 */
	public double getBonous() {
		return bonous;
	}

	/**
	 * @param bonous the bonous to set
	 */
	public void setBonous(double bonous) {
		this.bonous = bonous;
	}
	
	public double getSalary() {
		return super.getSalary()+bonous;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	
	

}
