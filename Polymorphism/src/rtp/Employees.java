package rtp;

public class Employees {

	 void work(){
		System.out.println("employee is working");
	}
}

 class Developer extends Employees {

	@Override
	void work() {
		System.out.println("Developing APP");
	}
}

 class Tester extends Employees{

	@Override
	void work(){
		System.out.println("Testing APP");
	}
 }
