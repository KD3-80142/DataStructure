package com.sunbeam;

public class employees {
	private int salary;
	private String name;
	private int empId;
	public employees() {
		// TODO Auto-generated constructor stub
	}
	public employees(int salary, String name, int empId) {
		super();
		this.salary = salary;
		this.name = name;
		this.empId = empId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "employees [salary=" + salary + ", name=" + name + ", empId=" + empId + "]";
	}
	
   
}
