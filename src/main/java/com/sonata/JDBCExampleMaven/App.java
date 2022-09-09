package com.sonata.JDBCExampleMaven;

import com.sonata.DAOimpl.EmployeeImpl;
import com.sonata.model.Employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Employee s1=new Employee();
	s1.setEmpid(13);
	s1.setName("sid");
	
	EmployeeImpl p1=new EmployeeImpl();
	int a1=p1.save(s1);
	System.out.println(a1);
	}

}
