package com.jdbc.miniproject;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;
import java.sql.SQLIntegrityConstraintViolationException;

public class Main { 
	 static   Scanner input=new Scanner(System.in);
	 public static void main(String[] args) throws SQLException, ParseException   {
      
		System.out.println("1.Viewdetail\n2.Insert\n3.update\n4.delete\n5.Exit ");
		boolean continueOpt=true;
		while(continueOpt) {
              System.out.println("Enter the option: ");
              int option=input.nextInt();
              switch(option) {
                case 1:
                	Employee emp=EmployeeDAO.viewEmployeeDetail(Detail.getEmployeeId());
	        	    if( emp.getEmpId()==0) {
	        	    	System.out.println("Employee not found..");	
	        	    }
	        	    else {
	        	    	System.out.println(emp.toString());
	        	    }
	        	    continueOpt=Detail.makePrediction();
        	        break;    
                case 2:
                	try {
                         System.out.println(EmployeeDAO.insertEmployee(Detail.getEmployeeDetails()));
                    }catch(SQLIntegrityConstraintViolationException e) {
                    	System.out.println("Dupicate entry....Doesnot insert the employee detail");
                    }
  	        	    continueOpt=Detail.makePrediction();
          	        break;
               
                case 3:
                	System.out.println(EmployeeDAO.updateEmployee(Detail.getEmployeeDetails(),Detail.getEmployeeId()));
  	        	    continueOpt=Detail.makePrediction();
          	        break;
                case 4:
                	System.out.println(EmployeeDAO.deleteEmployee(Detail.getEmployeeId()));
  	        	    continueOpt=Detail.makePrediction();
          	        break;
                case 5:
                	System.out.println("Exited...");
                	System.exit(0);
                default:
                	System.out.println("Invalid choice");
                	System.exit(0);
             }
      }
		
		
	}
	
}
