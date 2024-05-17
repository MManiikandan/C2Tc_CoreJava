package com.mmanikandan.assignment1.utilities;

import com.mmanikandan.assignment1.employees.Developer;
import com.mmanikandan.assignment1.employees.Empolyee;
import com.mmanikandan.assignment1.employees.Manager;

public class EmpolyeeUtilities {
	public EmpolyeeUtilities(Empolyee emp){
		    System.out.println("--------------------------------------------");
            System.out.println("Empolyee name : "+emp.getName());
            System.out.println("Empolyee id : "+emp.getEmployeeId());
            System.out.println("Empolyee salary : "+emp.getSalary());
	    	if(emp instanceof Manager) {
	    		System.out.println("Employee Role: Manager");
	    		System.out.println("Empolyee Bonous : "+((Manager) emp).getBonous());
	    		System.out.println("Empolyee department : "+((Manager)emp).getDepartment());
	    	}
	    	else {
	    		System.out.println("Employee Role: Developer");
	    		System.out.println("Employee used the language  : "+((Developer)emp).getProgrammingLanguage());
	    		System.out.println("Empolyee current project : "+((Developer)emp).getCurrentProject());
	    	}
	       System.out.println("--------------------------------------------");
	}
}
