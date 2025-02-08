package com;

public class CalculaterImpl implements Calculator{

	@Override
	public void add(int x,int y) {
		System.out.println(x+y);
	}
	@Override
	public void sub(int x,int y) {
		System.out.println(x-y);
	}
	public void mul(int x,int y) {
		System.out.println(x*y);
	}
	public void div(int x,int y) {
		System.out.println(x/y);
	}
	
}
