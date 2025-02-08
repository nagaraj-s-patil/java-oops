package com;

public class EmployeesMainClass {

	public static void main(String[] args) {

		Employees emp=new Employees();
		System.out.println("id "+emp.id);
		System.out.println("name "+emp.name);
		
		Employees.work();
		
	}
}
