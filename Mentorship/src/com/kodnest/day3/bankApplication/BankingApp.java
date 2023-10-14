package com.kodnest.day3.bankApplication;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(123456789, "Chirag", 100000);
		System.out.println("Balance is "+account.deposit(50000));
		System.out.println("Balance is "+account.withDraw(10000));
		

	}

}
