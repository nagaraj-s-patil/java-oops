package ctp;

public class Student {

	void display(int age) {
		System.out.println("Age: " + age);
	}

	void display(String name) {
		System.out.println("Name: " + name);
	}

	void display(int age, String name) {
		System.out.println("Name: " + name + " Age: " + age);
	}

	void display(String name, int age) {
		System.out.println("name: " + name + " Age: " + age);
	}

}
