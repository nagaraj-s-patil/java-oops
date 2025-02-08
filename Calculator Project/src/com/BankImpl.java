package com;

public class BankImpl implements Bank {
	
	private double balance;
	public void deposit(int amt) {
		System.out.println("\n deposit amount "+amt);
		balance+=amt;
		
	}
	public void withdrow(int amt) {
		if(balance>=amt) {
		System.out.println("\n withdrow amount "+amt);
		balance-=amt;
		
		}
		else
			System.out.println("insufficent balance");
	}
	public void checkBalance() {
		System.out.println("\n balance is "+balance);
	}
	
}
