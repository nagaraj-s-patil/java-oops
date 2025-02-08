package nonstaticexample;

public class PersonMainClass {

	public static void main(String[] args) {

		Person P=new Person();

		System.out.println("name: "+P.name+" age: "+P.age) ;
		P.eat();
	}
}
