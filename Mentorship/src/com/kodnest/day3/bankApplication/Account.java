package com.kodnest.day3.bankApplication;

public class Account {

	long accNum;
	String accHolder;
	int balance;
	public Account(long accNum, String accHolder, int balance) {
		super();
		this.accNum = accNum;
		this.accHolder = accHolder;
		this.balance = balance;
	}
	
	public int deposit(int amount)
	{
		balance=balance+amount;
		return balance;
	}
	
	public int withDraw(int amount)
	{
		if(balance>amount)
		{
			balance=balance-amount;
		}
		return balance;
	}
}
