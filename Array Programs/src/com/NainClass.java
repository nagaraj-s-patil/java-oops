package com;

public class NainClass {
	public static void main(String[] args) {

		int[] a= {10,20,30};

		for(int i=a.length-1;i>=0 ;i--) {
			System.out.println(a[i]);
		}

		System.out.println("------------------------");
		String[] subject= {"java","python","javaScript","Ruby"};
		
		for(int i=subject.length-1;i>=0;i--) {
			System.out.println(subject[i]);
		}
		
		
	}

}
