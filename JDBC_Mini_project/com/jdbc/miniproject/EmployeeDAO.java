package com.jdbc.miniproject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.function.Predicate;

public class EmployeeDAO{

	public static Employee viewEmployeeDetail(int empId) throws SQLException, ParseException   {
	    Employee emp=new Employee();
	    Connection con=DBconnection.getConnection();
	    String query="SELECT * FROM employee WHERE Emp_id="+empId;
	    Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			 emp.setEmpId(rs.getInt(1));
			 emp.setEmpJoiningDate(new SimpleDateFormat("yyyy-MM-dd")
					              .parse(rs.getString(2)));
			 emp.setEmpName(rs.getString(3));
			 emp.setEmpDesignation(rs.getString(4));
			 emp.setEmpSalary(rs.getInt(5));
			 emp.setEmpMail(rs.getString(6));
		}	
		DBclose.getClose(con);
		return emp;
    }
    public static void  insertEmployee(Employee employee) throws SQLException {
    	 Connection con=DBconnection.getConnection();
    	 String query="INSERT INTO employee("
    	 		+ "Emp_joiningDate,"
    	 		+ "Emp_name,"
    	 		+ "Emp_designation,"
    	 		+ "Emp_salary,"
    	 		+ "Emp_mailid"
    	 		+ ")"
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
   
    public static void updateEmployee(Employee employee,int empid) throws SQLException {
   	        Connection con=DBconnection.getConnection();
		    String query="UPDATE employee SET Emp_joiningDate=?,Emp_name=?,Emp_designation=?,Emp_salary=?,Emp_mailid=? WHERE Emp_id=?;";
	        PreparedStatement pst=con.prepareStatement(query);
			pst.setDate(1, new java.sql.Date(employee.getEmpJoiningDate().getTime()));
			pst.setString(2, employee.getEmpName());
			pst.setString(3, employee.getEmpDesignation());
			pst.setInt(4, employee.getEmpSalary());
			pst.setString(5,employee.getEmpMail());
			pst.setInt(6,empid);
			pst.executeUpdate();
			String msg=" Employee Details  Successfully updated into the employee table";
			MailSend.sendMail(employee,msg);
			System.out.println(msg);	
	        DBclose.getClose(con);  
      }
	    public static void deleteEmployee( int empid) throws SQLException, ParseException {
	   	 Connection con=DBconnection.getConnection();
	   	 Employee emp=viewEmployeeDetail(empid);
	   	 String query="DELETE FROM employee WHERE Emp_id="+empid;
	   	 Statement st=con.createStatement();
	   	 Predicate<Integer> prediction=(no)->no>=1;
	   	 if(prediction.test(st.executeUpdate(query))) {
		    	 String msg="Employee Details  Successfully deleted into the employee table";
		    	 MailSend.sendMail(emp,msg);
		    	 System.out.println(msg);
	   	 }else {
	   	   String msg="Invalid employee";
	   	   System.out.println(msg);
	   	 }   
	   }
}
