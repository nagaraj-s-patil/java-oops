package com;

public class Tom implements Employe {

	public void work() {
		System.out.println("Tom is working");
	}

	public static void main(String[] args) {

		System.out.println("work is "+Tom.id);

		Tom t=new Tom();
		t.work();

	}

}
