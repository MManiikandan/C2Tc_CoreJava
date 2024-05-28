package com.jdbc.miniproject;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

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
                    EmployeeDAO.insertEmployee(Detail.getEmployeeDetails());
  	        	    continueOpt=Detail.makePrediction();
          	        break;
               
                case 3:
                	EmployeeDAO.updateEmployee(Detail.getEmployeeDetails(),Detail.getEmployeeId());
  	        	    continueOpt=Detail.makePrediction();
          	        break;
                case 4:
                	EmployeeDAO.deleteEmployee(Detail.getEmployeeId());
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
