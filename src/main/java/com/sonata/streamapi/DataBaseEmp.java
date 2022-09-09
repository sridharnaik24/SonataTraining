package com.sonata.streamapi;

import java.util.ArrayList;
import java.util.List;

public class DataBaseEmp {

	public static List<Employee>getEmployee(){
		List<Employee>list=new ArrayList();
		list.add(new Employee(172,"sid","it",5000));
		list.add(new Employee(102,"sidharth","civil",5000));
		list.add(new Employee(122,"sid sriram","it",5000));
		list.add(new Employee(182,"sidhu","social",5000));
		list.add(new Employee(192,"sridhar","training",5000));
	return list;
	}
}
