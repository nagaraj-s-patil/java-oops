package PracticeOnSeminar;

class Vehicle {

	Vehicle(String brand){
		System.out.println("In vehicle");
	}
}
public class ConstructorChaning extends Vehicle{

	ConstructorChaning(){
		super("honda");
		System.out.println("In bike");
		  
	}
	

	public static void main(String[] args) {
		ConstructorChaning e2=new ConstructorChaning();
		
		
	}
}
