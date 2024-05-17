package com.mmanikandan.assignment1.employees;

import com.mmanikandan.assignment1.utilities.EmpolyeeUtilities;

public class AssignmentMain {

    public static void main(String[] args) {
    	Manager manager=new Manager("Sivalingam",101,200000,50000,"HR");
    	Developer developer=new Developer("Manikandan",102,100000,"Automation","Java");
    	new EmpolyeeUtilities(manager);
    	new EmpolyeeUtilities(developer);
    	System.out.println("Total employees : "+Empolyee.getTotalEmployee());
    }
   
  
}
