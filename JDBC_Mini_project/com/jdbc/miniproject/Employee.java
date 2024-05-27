package com.jdbc.miniproject;

import java.util.Date;

public class Employee {
    private    int empId;
    private   Date empJoiningDate;
    private String empName;
    private String empDesignation;
    private int empSalary;
    private String empMail;
    
	/**
	 * @param empId
	 * @param empJoiningDate
	 * @param empName
	 * @param empDesignation
	 * @param empSalary
	 * @param empMail
	 */
	public Employee(int empId, Date empJoiningDate, String empName, 
			String empDesignation, int empSalary,String empMail) {
		this.empId = empId;
		this.empJoiningDate = empJoiningDate;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
		this.empMail = empMail;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the empJoiningDate
	 */
	public Date getEmpJoiningDate() {
		return empJoiningDate;
	}
	/**
	 * @param empJoiningDate the empJoiningDate to set
	 */
	public void setEmpJoiningDate(Date empJoiningDate) {
		this.empJoiningDate = empJoiningDate;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empDesignation
	 */
	public String getEmpDesignation() {
		return empDesignation;
	}
	/**
	 * @param empDesignation the empDesignation to set
	 */
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	/**
	 * @return the empSalary
	 */
	public int getEmpSalary() {
		return empSalary;
	}
	

	/**
	 * @param empSalary the empSalary to set
	 */
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	/**
	 * @return the empMail
	 */
	public String getEmpMail() {
		return empMail;
	}
	/**
	 * @param empMail the empMail to set
	 */
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empJoiningDate=" + empJoiningDate + ", empName=" + empName
				+ ", empDesignation=" + empDesignation + ", empSalary=" + empSalary + ", empMail=" + empMail + "]";
	} 
}
