package primitivecasting;

public class Demo {

	public static void main(String[] args) {

		// Wideing
		int a = 25;
		double b = a;
		System.out.println(a + " | " + b);// 25 25.0

		double c = 50;
		System.out.println(c);// 50.0

		char x = 'A';
		int y = x;
		System.out.println(x + " | " + y);// A 65
		

		System.out.println("------------------");
		
		
		//Norrowing
		
		double i=23.45;
		int j=(int)i;
		System.out.println(i+" | "+j);// 23.45  23

		int z=(int )45.67;
		System.out.println(z);//45
		
		int p=68;
		char q=(char)p;
		System.out.println(p+" | "+q);//68 D
		

		System.out.println("------------------");
		
		
		System.out.println((int)65.75);//65
		System.out.println((char)65);//A
		System.out.println("A"+"B");//AB
		System.out.println("A"+10);//A10
		System.out.println('A'+'B');//AB
		System.out.println("A"+10+20);//A1020
		System.out.println(10+20+"A");//30A
		System.out.println('A'+'B');//131
		System.out.println('a'+20);//117
		
		System.out.println(' '+0);//32l
		
		
		

	}

}
