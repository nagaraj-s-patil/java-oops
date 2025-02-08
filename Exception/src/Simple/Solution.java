package Simple;

import java.util.*;
import java.io.FileNotFoundException;
public class Solution {
	
	static void run() {
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		
		finally {
			System.out.println("inside finally");
			sc.close();
		}
		
	}

	public static void main(String[] args) {
		
		run();
		
	}
}
