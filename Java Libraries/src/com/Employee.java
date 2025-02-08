package com;

public class Employee {

	int id;
	String name;

	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}


	public String toString() {
		return "Emp id of "+id+" name is "+name;
	}
	public static void main(String[] args) {

		Employee e=new Employee(100, "tom");
		Employee e2=new Employee(102,"Sanket");

		System.out.println(e);
		System.out.println(e2);

	}
}
