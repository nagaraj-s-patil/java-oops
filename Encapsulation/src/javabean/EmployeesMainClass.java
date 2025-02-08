package javabean;

import java.util.Scanner;

public class EmployeesMainClass {
	public static void main(String[] args) {

		Employees emp=new Employees();
		System.out.println("Enter youer Eid and name");
		Scanner sc=new Scanner(System.in);
		emp.setId(sc.nextInt());
		emp.setName(sc.next());
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		
	}

}
