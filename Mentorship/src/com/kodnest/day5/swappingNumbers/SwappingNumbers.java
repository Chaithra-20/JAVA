package com.kodnest.day5.swappingNumbers;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long ph1=scan.nextLong();
		long ph2=scan.nextLong();
		swapTwoNumbers(ph1,ph2);
	
	}
	
	public static void swapTwoNumbers(long ph1,long ph2)
	{
		ph1=ph1+ph2;
		ph2=ph1-ph2;
		ph1=ph1-ph2;
	    System.out.println(ph1+","+ph2);
				
	}

}
