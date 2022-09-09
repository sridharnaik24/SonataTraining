package com.sonata.streamapi;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparator implements Comparator<Employee> {
	public int compare(Employee o1,Employee o2) {
		return (int)(o1.getEmpSal()-o2.getEmpSal());
	} 
	public  class SortExampleEmployee {
		public void main(String args[]) {
			List<Employee> employee =DataBaseEmp.getEmployee();
			
			Collections.sort(employee,new MyComparator());
			System.out.println(employee);
			
			Collections.sort(employee,(o1,o2)->(int)(o1.getEmpSal()- o2.getEmpSal()));
			System.out.println(employee);
			
			
			employee
			.stream()
			.sorted((o1,o2)->(int)(o1.getEmpSal()-o2.getEmpSal()))
			.forEach(System.out::println);
		
		}
	}
	

}
