package com;
//Accesing  public members inside same class
public class Student {

	public static int age=22;
	public static String name="tom";

	public void study() {
		System.out.println("studying java!");
	}
	public static void main(String arg[]) {
		System.out.println("Age "+Student.age);
		System.out.println("Name "+Student.name);

		Student s=new Student();
		s.study();
	}
}
