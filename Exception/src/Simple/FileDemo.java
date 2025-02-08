package Simple;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class FileDemo {

	static void read() throws FileNotFoundException,ArithmeticException{

			FileReader fr=new FileReader("open.tex");
			System.out.println(10/0);
			
	}
	
public static void main(String[] args) {
		
		System.out.println("Start");
		
		try {
			FileDemo.read();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Ends");
	}
}
