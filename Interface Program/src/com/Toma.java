package com;

public class Toma extends Person implements Hotel,Theater{

	@Override
	public void orderFood(String name) {
		System.out.println("Order a food");
		
	}
	@Override
	public void watchingMovie() {
		System.out.println("watching movie");
		
	}
/**
 * 	optionally we can also ocerride walk() from person
 * 	@Override
	void walk() {
		// TODO Auto-generated method stub
		super.walk();
	}
	*/
	
	
	@Override
	void eat() {
		System.out.println("eaing food ");
	}
	public static void main(String[] args) {
		Toma t =new Toma();
		t.orderFood("rice");
		t.watchingMovie();
		t.walk();
		t.eat();
		
	}
	
}
