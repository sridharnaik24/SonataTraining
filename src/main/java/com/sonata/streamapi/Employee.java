package com.sonata.streamapi;

public class Employee {
	private int empId;
	private String empName;
	private String dept;
	private double empSal;
	
	public Employee(int empId, String empName, String dept, double empSal) {
		
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.dept = dept;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", dept=" + dept + "]";
	}
	

}
