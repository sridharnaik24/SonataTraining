package com.sonata.PreparedStatement;


import java.sql.*;

public class JdbcPreparedStatement {



	   public static void main(String[] args) {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_details","root","root@123");
	            PreparedStatement ps = con.prepareStatement("select * from emp where empId =?" );
	            ps.setInt(1, 123);
	            
	            ResultSet rs = ps.executeQuery();
	            while(rs.next()) {
	                System.out.println(rs.getInt(1));
	                System.out.println(rs.getString(2));
	                System.out.println(rs.getDouble(3));
	                
	            }
	        }catch(ClassNotFoundException e1) {System.out.println(e1);}
	        catch(SQLException e2) {e2.printStackTrace();}
	        
	        }
}

