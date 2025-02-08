package com;

import java.util.Scanner;

public class BankMainClass {

	public static void main(String[] args) {

		System.out.println("<-Welecome To RBI Bank->");
		Bank b=new BankImpl();
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {



				System.out.println("Enter your choice");
				System.out.println("1:deposit\n2:withdrow\n3:checkBalance\n4:exit");
				int choice=sc.nextInt();
				int amt=0;
				if(choice>=1 &&choice<=2) {
					System.out.println("Enter amount");
					amt=sc.nextInt();
				}

				switch(choice) {
				case 1:
					b.deposit(amt);
					break;
				case 2:	
					b.withdrow(amt);
					break;
				case 3:	
					b.checkBalance();
					break;
				case 4	:
					System.out.println("thank you");
					System.exit(0);

				default:
					System.out.println("Invalid choice");
				}
				System.out.println("------------------ \n \n ");
				

			}
		}
	}

}


