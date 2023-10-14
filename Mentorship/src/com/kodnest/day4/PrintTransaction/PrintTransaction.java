package com.kodnest.day4.PrintTransaction;

import java.util.Scanner;

public class PrintTransaction {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long tr1=scan.nextLong();
		long tr2=scan.nextLong();
		
		System.out.println("Total money transfered is : "+(tr1+tr2));

	}

}
