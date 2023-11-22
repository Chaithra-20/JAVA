package com.kodnest.day7.ATMWithdrawl;

import java.util.Scanner;

public class ATMWithDrawl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int amount=scanner.nextInt();
		
			int hundreds=amount/100;
			amount%=100;
			int fifties=amount/50;
			amount%=50;
			int twenties=amount/20;
			amount%=20;
			int tens=amount/10;
			amount%=10;
			int fives=amount/5;
			amount%=5;
			
	
			System.out.println(hundreds+" hundred-dollar bills, "+fifties+" fifty-dollar bills,"
			+twenties+" twenty-dollar bills, "+tens+" ten-dollar bills, "+fives+" five-dollar bills");

	}

}
