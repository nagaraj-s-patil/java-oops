package Simple;

import java.io.FileReader;

public class Solutions {

	static void run() throws ArithmeticException{

		FileReader fr=new FileReader("Text.txt");

	}
	static void exec() throws AtirhmeticException{
		
		System.out.println(10/0);
	}





	public static void main(String[] args) {

		System.out.println("Start");

		try {
		run();

		}
		catch(Exception e) {
			System.out.println("");
		}
		System.out.println("End");
	}
}
