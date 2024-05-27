package com.jdbc.miniproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.function.Predicate;
 public class Detail {
	    static Scanner input = new Scanner(System.in) ;
	    public static boolean makePrediction() {
		 System.out.println("Are you want continue: 1.yes 2.No Enter the continueOption:");
   	     Predicate<Integer> prediction=no->no==1;
   	     return prediction.test(input.nextInt());
	     } 
	 	public static Employee getEmployeeDetails() throws ParseException {
			 SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		     Employee emp=new Employee();
			 System.out.println("Enter the Employee Name");
			 emp.setEmpName(input.nextLine());
			 System.out.println("Enter the Employee joining date (dd-MM-yyyy): ");
			 emp.setEmpJoiningDate(dateFormat.parse(input.nextLine()));
			 System.out.println("Enter the Employee Designation :");
			 emp.setEmpDesignation(input.nextLine());
			 System.out.println("Enter the Employee Salary");
			 emp.setEmpSalary(input.nextInt());
			 input.nextLine();
			 System.out.println("Enter the Emplyee Email id : ");
			 emp.setEmpMail(input.nextLine());
			 boolean emailvalid=EmailValidator.isValidEmail(emp.getEmpMail());;
			 while(!emailvalid) {
				 System.out.println("Invalid mail enter again: ");
				 emp.setEmpMail(input.nextLine());
				 emailvalid=EmailValidator.isValidEmail(emp.getEmpMail());
			 }
		
  	       return emp;
		 
     }
	 	public static int getEmployeeId() {
			System.out.println("Enter the Emp_id");
			return input.nextInt();
					
	}
}
	

