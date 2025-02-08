package com;

public class Demo {
	public static void main(String[] args) {

		//Arry declaration
		int[] a;

		//Arry Crition
		a=new int[3];

		//printing array elements
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println();
		System.out.println("lenth of an array a "+a.length);

		System.out.println("-----------------------------");

		//Array initialization

		a[0]=10;
		a[2]=50;

		//Array printing
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

		System.out.println("-----------------------------");

		//double creation and initialization

		double[] x=new double[2];

		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println("length of array x "+x.length);
		System.out.println("-----------------------------");

		x[0]=1.2;
		x[1]=2.4;
		System.out.println(x[0]);
		System.out.println(x[1]);





	}

}
