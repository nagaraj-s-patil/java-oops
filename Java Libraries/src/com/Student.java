package com;

public class Student {

	int age;
	Student(int age){
		this.age=age;
		
	}
	
	@Override
	public String toString() {
		return "age is "+age;
	}
	public static void main(String[] args) {
		
		Student s=new Student(20);
		System.out.println(s);
	}
}
