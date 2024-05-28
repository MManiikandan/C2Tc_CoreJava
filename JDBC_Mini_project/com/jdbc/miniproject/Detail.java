package com.jdbc.miniproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;
 public class Detail {
	    static Scanner input = new Scanner(System.in) ;
	    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
	    private static  Predicate<String> prediction=email-> pattern.matcher(email).matches();
	    public static boolean makePrediction() {
		 System.out.println("Are you want continue: 1.yes 2.No Enter the continueOption:");
   	     Predicate<Integer> prediction=no->no==1;
   	     return prediction.test(input.nextInt());
	     } 
	 	public static Employee getEmployeeDetails() throws ParseException {
		     Employee emp=new Employee();
			 System.out.println("Enter the Employee Name :");
			 emp.setEmpName(input.nextLine());
			 System.out.println("Enter the Employee joining date (yyyy-MM-dd): ");
			 emp.setEmpJoiningDate(new SimpleDateFormat("yyyy-MM-dd").parse(input.nextLine()));
			 System.out.println("Enter the Employee Designation : ");
			 emp.setEmpDesignation(input.nextLine());
			 System.out.println("Enter the Employee Salary :");
			 emp.setEmpSalary(input.nextInt());
			 input.nextLine();
			 System.out.println("Enter the Emplyee Email id : ");
			 emp.setEmpMail(input.nextLine());
			 boolean emailvalid=prediction.test(emp.getEmpMail());
			 while(!emailvalid) {
				 System.out.println("Invalid mail enter again: ");
				 emp.setEmpMail(input.nextLine());
				 emailvalid=prediction.test(emp.getEmpMail());
			 }
  	       return emp;
		 
     }
	 	public static int getEmployeeId() {
			System.out.println("Enter the Employee id :");
			return input.nextInt();			
	   }
}
	

