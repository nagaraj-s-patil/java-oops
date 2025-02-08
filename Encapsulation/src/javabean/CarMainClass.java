package javabean;
import java.util.*;

public class CarMainClass {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Cost of Car");
		int n=sc.nextInt();
		
		Car c=new Car();
		c.setCost(n);
		int result =c.getCost();
		
		System.out.println("cost is  "+result);
	}

}
