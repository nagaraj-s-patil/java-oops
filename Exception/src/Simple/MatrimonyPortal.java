package Simple;

import java.util.Scanner;

public class MatrimonyPortal {

	static void validDateAge(int age) throws InvalidAgeException{
		
		if(age >21) {
			System.out.println("geet married soon");
		}
		else
			throw new InvalidAgeException("invalid Age");		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		Scanner sc=new Scanner(System.in);
		
		int age=sc.nextInt();
		sc.close();
		
		try {
			validDateAge(age);
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}
	
}
