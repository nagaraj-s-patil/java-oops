package Simple;

public class ArrayExecption {

	public static void main(String[] args) {
		
		System.out.println("start");
		int[] a= {10,20,30,40};
		try {
			System.out.println(a[35]);
		}catch(ArithmeticException e) {
			System.out.println("Denominator should not be zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Specifled Index is not present");
		}
		
		System.out.println("End");
		
	}
}
