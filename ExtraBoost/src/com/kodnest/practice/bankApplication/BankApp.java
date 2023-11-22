package com.kodnest.practice.bankApplication;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		long accNo=scanner.nextLong();
		scanner.nextLine();
		String accHolder=scanner.nextLine();
		
		
		Account account = new Account(accNo,accHolder);
		System.out.println("Account Number : "+account.getAccNo());
		System.out.println("Account Holder Name : "+account.getAccHolder());

	}

}
