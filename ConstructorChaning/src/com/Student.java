package com;

public class Student {

	Student (int age){
		System.out.println("age is "+age);
	}
	Student(String name){
		this(23);
		System.out.println("Name "+name);
	}
	Student(double height){
		this("Tom");
		System.out.println("height "+height);
	}
	public static void main(String[] args) {

		new Student(5.7);

	}

}
