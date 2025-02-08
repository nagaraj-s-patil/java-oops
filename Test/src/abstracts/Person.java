package abstracts;

public class Person extends FlipCard {

	public void Buy() {
		System.out.println("Buy a phone");
	}
	public void Pay() {
		System.out.println("Paying 40000");
	}
	
	public static void main(String[] args) {
		
		Person p=new Person();
		p.Buy();
		p.Pay();
	}
}
