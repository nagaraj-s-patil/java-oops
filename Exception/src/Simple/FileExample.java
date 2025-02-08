package Simple;

import java.io.FileReader;

public class FileExample {

	//unchecked exception
	void read() {

		try {
			FileReader f=new FileReader("open.txt");
		}
		catch(Exception e) {
			System.out.println("File is not present");
		}


	}
	void divide() {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("zero a");
		}
	}

	public static void main(String[] args) {

		FileExample fe=new FileExample ();
		fe.read();
		fe.divide();
	}
}
