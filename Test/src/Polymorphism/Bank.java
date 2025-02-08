package Polymorphism;

public class Bank {

	public void Pay(int atmNO ,String pw) {
		System.out.println("Pay by ATM");
	}
	
	
	public void Pay(String UPI,int pw) {
		System.out.println("Pay by UPi");
	}
	
	
	public void Pay(int NetBank ,int pw) {
		System.out.println("Pay by netBank");
	}
}
