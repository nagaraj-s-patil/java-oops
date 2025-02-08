package Polymorphism;



public class EmployeesClass {
	
	static void display(Employees obj) {
		obj.working();
	}
	
	public static void main(String[] args) {

	
		display(new Developer());
		display(new tester());
		
		System.out.println("----------");
		
		Employees e1=new Developer();
		e1.working();
		
		Employees e2=new tester();
		e2.working();
		
	}
}
