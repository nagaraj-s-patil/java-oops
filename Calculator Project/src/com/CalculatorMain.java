package com;

import java.util.Scanner;

public class CalculatorMain {


	public static void main(String[] args) {

		System.out.println("will come to Calculator Project");
		System.out.println("-----------------------");
		while(true) {

			Scanner sc =new Scanner(System.in);

			System.out.println("choice one ");
			System.out.println("1.Adddition 2.subtraction \n3.multiplication 4.dividing 5.exit");
			int choice=sc.nextInt();
			/*
			 * local variables does not have default values
			 * Therefore intializing it to 0 explicity
			 * declaring x & y outside if because to increass visibility
			 * 
			 * */
			int n=0;
			int m=0;
			if(choice>=1 && choice<=4) {
				System.out.println("Enter 2 number");
				n=sc.nextInt();
				m=sc.nextInt();
			}

			Calculator calc=new CalculaterImpl();//Upcasting for abstraction
			
			switch(choice) {
			case 1:
				calc.add(n,m);
				break;
			case 2:
				calc.sub(n,m);
				break;

			case 3:		
				calc.mul(n,m);
				break;

			case 4:						
				calc.div(n,m);
				break;
				
			case 5:
				System.out.println("thank you");
				System.exit(0);
				break;

			default:
				System.out.println(" choice is wrong");
			}

			System.out.println("-------------------------");
			sc.close();
		}
	}
}
