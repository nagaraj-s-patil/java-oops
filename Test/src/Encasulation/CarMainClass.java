package Encasulation;
import java.util.*;

public class CarMainClass {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Cost of car");
		int cost=sc.nextInt();
		
		Car c=new Car();
		
		c.setCost(cost);
		
		System.out.println(c.getCost());
	}

}
