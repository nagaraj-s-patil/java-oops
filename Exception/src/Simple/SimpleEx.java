package Simple;
import java.util.*;
public class SimpleEx {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Start");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {//only its execute if try is wrong 
			System.err.println("Dont divide by Zero");
		}
		
		System.out.println("Quotient has been found");
		System.out.println("End");


	}
}
