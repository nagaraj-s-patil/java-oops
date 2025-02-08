package rtp;

public class Vehicle {

	void start() {

		System.out.println("vehicle started");
	}
}

class Car extends Vehicle { // rule1

	@Override //rule2
	void start() {

		System.out.println("Car started");
	}
}

class Bike extends Vehicle {

	@Override
	void start() {
		System.out.println("Bike started");
	}
}
