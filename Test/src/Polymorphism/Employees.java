package Polymorphism;

public class Employees {
	
	void working() {
		System.out.println("Employee is working");
	}
}

class Developer extends Employees{
	
	@Override
	void working() {
		System.out.println("Developer developing App");
	}
}
class tester extends Employees{
	
	@Override
	void working() {
		System.out.println("tester testing a APP");
	}
}
