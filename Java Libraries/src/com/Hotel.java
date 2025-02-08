package com;

public class Hotel {
	String name;
	double ratings;
	
	Hotel(String name,double ratings){
		this.name=name;
		this.ratings=ratings;
	}
	public String toString() {
	
		return name+" has a ratings of "+ratings;
	}
	

}
