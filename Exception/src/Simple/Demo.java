package Simple;

public class Demo {
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		int[] a= {10,20,30,40};
		
		
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("invalid dominater");
		}
		catch(Exception e) {
			System.out.println("Excption handel");
		}
	}
}
