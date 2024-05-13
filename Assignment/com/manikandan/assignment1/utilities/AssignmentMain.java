package com.manikandan.assignment1.utilities;
import java.util.*;

import com.manikandan.assignment1.employees.*;
public class AssignmentMain {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
          Developer dev = new Developer("rahman",20,
        		              Employee.totalEmployees+1
        		             ,30000.00,"mmanikandan",2
        		             );
          
          System.out.println(EmployeeUtilities.gitHubLink(dev));
          
          Manager man = new Manager("abu",20
        		  ,Employee.totalEmployees+1,45684.00,"toast",3,6);
         
          System.out.println(EmployeeUtilities.salaryDifference(dev, man));
         
          EmployeeUtilities.printBasicDetails(man);
          
	}

}
