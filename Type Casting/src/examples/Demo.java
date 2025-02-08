package examples;

import java.util.*;

public class Demo {

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter youer number");
			int n = sc.nextInt();

			switch (n) {

			case 1: {
				System.out.println("Hi");
				break;
			}
			case 2: {
				System.out.println("Bye");
				break;
			}

			case 3: {
				System.out.println("thank you");
				System.exit(0);
				break;
			}

			default: {
				System.out.println("involid number");
			}

			}
			System.out.println("------------");
		}

	}
}
