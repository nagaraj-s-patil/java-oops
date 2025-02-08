package com;

 class Jack implements Uber{
	 
	 @Override
	public void payAmount() {
		 System.out.println("Pay amount");
		
	}
	 @Override
	public void bookCab() {
		 System.out.println("book a cab");
		
	}

	 public static void main(String[] args) {
		 Jack j =new Jack();
		 j.bookCab();
		 j.payAmount();
		
	}
}
