package com;

public class Bike  extends Vehicle{

	Bike(){
		super("honda");
		System.out.println("In bike");
		
	}
	public static void main(String[] args) {
		new Bike();
	}
}
