package com.jdbc.miniproject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.function.Predicate;

public class EmployeeDAO{
  public static void viewEmployeeDetail(int empId) throws SQLException   {
	    Connection con=DBconnection.getConnection();
	    String query="SELECT * FROM employee WHERE Emp_id="+empId;
	    Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		boolean found = false;
		while(rs.next()) {
			 found =!found;
			System.out.println("Employee id is:"+rs.getInt(1));
			System.out.println("Employee joining date:"+rs.getString(2));
			System.out.println("Employee Name:"+rs.getString(3));
			System.out.println("Employee Designation "+rs.getString(4));
			System.out.println("Employee Email id "+rs.getString(5));
		}

		if(!found) {
			System.out.println(" Employee not found..");
		}
		DBclose.getClose(con);
    }
    public static void  insertEmployee(Employee employee) throws SQLException {
    	 Connection con=DBconnection.getConnection();
    	 String query="INSERT INTO employee(Emp_joiningDate,Emp_name, Emp_designation, Emp_salary, Emp_mailid)"
    	  		      + "values(?,?,?,?,?);";
    	 PreparedStatement pst=con.prepareStatement(query);
    	 try {
    	 pst.setDate(1, new java.sql.Date(employee.getEmpJoiningDate().getTime()));
    	 pst.setString(2, employee.getEmpName());
    	 pst.setString(3, employee.getEmpDesignation());
    	 pst.setInt(4, employee.getEmpSalary());
    	 pst.setString(5, employee.getEmpMail());
    	 pst.executeUpdate();
    	 String msg="  Employee Details  Successfully insert into the employee table";
    	 MailSend.sendMail(employee,msg);
    	 System.out.println(msg);
    	 
    	 }
    	 catch(SQLIntegrityConstraintViolationException e) {
    		 System.out.println("Duplicate entry..Doesnot Insert the Employee detail");
    	 }
    	 DBclose.getClose(con);
    }
    public static void deleteEmployee(int emp_id) throws SQLException {
    	 Connection con=DBconnection.getConnection();
    	 String query="DELETE FROM employee WHERE Emp_id="+emp_id;
    	 Statement st=con.createStatement();
    	 Predicate<Integer> prediction=(no)->no>=1;
    	 if(prediction.test(st.executeUpdate(query))) {
	    	 String msg=" Employee Details  Successfully deleted into the employee table";
	    	 System.out.println(msg);
    	 }else {
    	   String msg="Invalid employee";
    	   System.out.println(msg);
    	 }   
    }
}
