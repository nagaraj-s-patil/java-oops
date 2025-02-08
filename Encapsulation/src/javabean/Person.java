package javabean;

public class Person {

	private int age;
	
	public void setAge(int age) {
		
		if(age>0) {
			System.out.println("valid");			
		this.age=age;
		}
		else
			System.out.println("invalid");
	}
	public int getAge() {
		return age;
	}
}
