package rtp;

public class MainRunner {

	static void display(Employees obj) {
		obj.work();
	}
	
	public static void main(String[] args) {

		//1 Upcasting Using method
		display(new Developer());
		display(new Tester());
		
		System.out.println("----------");
		
		//2 Upcasting using seperate reference variable
		Employees e1=new Developer();
		e1.work();
		
		Employees e2=new Tester();
		e2.work();
		
		System.out.println("-----------");
		//3 upcasting using single reference variable
	Employees e;
		e=new Developer();
		e.work();
		
		e=new Tester();
		e.work();
	}
}

