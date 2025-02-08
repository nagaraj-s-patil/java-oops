package rtp;

public class MainClass {
	
	//1.decideVehicle(new Car() ; ->Vehicleobj=new CAr() ->obj.start();
	//2.decideVehicle(new Bike(); ->Vehicle obj=new Bike() ->obj.start();
	
	static void decideVehivle(Vehicle obj) {
		obj.start();
	}

	public static void main(String[] args)  {
		
		//1.upcasting using seperate reference variabke
		
		decideVehivle(new Car()); //rule -3
		decideVehivle(new Bike()); //rule -4
		
		System.out.println("----++@++----");
		
		//2. Upcasting using seperate reference variable
		Vehicle v1=new Car();
		v1.start();
			
		Vehicle v2=new Bike();
		//3.Upcasting using single reference variable
		v2.start();
		 
		
		System.out.println("---++@++----");
		//3 upcasting using single reference variable
		Vehicle v;
		
		v=new Car();//rule -3
		v.start();
		
		v=new Bike();//rule -3
		v.start();
		
	}
		

}
