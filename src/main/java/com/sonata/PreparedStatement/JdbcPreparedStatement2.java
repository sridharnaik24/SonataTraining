package com.sonata.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcPreparedStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_details","root","root@123");
		PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
		ps.setInt(1,102);
		ps.setString(2,"sonata");
		ps.setDouble(3, 2345.69);
		int a=ps.executeUpdate();
		System.out.println("the number of records updated are "+a);

}catch(ClassNotFoundException e1) {System.out.println(e1);}
catch(SQLException e2) {e2.printStackTrace();}
		
	}

}
