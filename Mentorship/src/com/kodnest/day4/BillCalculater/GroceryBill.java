
package com.kodnest.day4.BillCalculater;

import java.util.Scanner;

public class GroceryBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int price1=scanner.nextInt();
		int price2=scanner.nextInt();
		int price3=scanner.nextInt();
		
		printSum(price1,price2,price3);
	}
	
	public static void printSum(int price1, int price2,int price3)
	{
		
		System.out.println(price1+price2+price3);
	}

}
