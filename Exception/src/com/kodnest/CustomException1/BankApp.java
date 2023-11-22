package com.kodnest.CustomException1;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw = ");
		double withDrawalAmount=scanner.nextDouble();
		try {
			withdraw(withDrawalAmount);
		} catch (InsufficientFundException e) {
			
			e.printStackTrace();
		}
		scanner.close();
	}

	private static void withdraw(double withDrawalAmount) throws InsufficientFundException {
		double accountBalance=15000.00;
		System.out.println("Withdraw process started...");
		if(withDrawalAmount<accountBalance )
		{
			System.out.println(withDrawalAmount+" has deducted from the account.");
		}
		else {
			System.out.println("Insufficient balance");
		}
		throw new InsufficientFundException("Reqested to check your balance and withdraw the amount");
		
	}
	

}
