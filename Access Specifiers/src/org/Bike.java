package org;
import com.Vehicles;

public class Bike extends Vehicles {
	
	public static void main(String[] args) {
		
		Bike b=new Bike();
		System.out.println("brand :"+b.brand);
		b.start();
	}

}
