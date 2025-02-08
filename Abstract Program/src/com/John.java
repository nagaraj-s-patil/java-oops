package com;

public class John extends FlipCard{

	@Override
	void Buy() {
		System.out.println("buy a laptop from flipCard");
	}
	@Override
	void Pay() {
		System.out.println("paying ₹40000 using phone pay");
	}

	public static void main(String[] args) {

		John j=new John();
		j.Buy();
		j.Pay();
	}

}
