package com;

public class Son extends Father {

	Son(int a){
		//Super();// used implicittly
		System.out.println(2);
	}

	public static void main(String[] args) {
		Son s=new Son();
	}
}

