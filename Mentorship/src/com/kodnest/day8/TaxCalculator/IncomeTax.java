
package com.kodnest.day8.TaxCalculator;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int income=scan.nextInt();
		
		if(income<=10000)
		{
			System.out.println((income*5)/100.0);
		}
		else if(income>=10001 && income<=20000)
		{
			System.out.println((income*10)/100.0);
		}
		else if(income>=20001 && income<=50000)
		{
			System.out.println((income*15)/100.0);
		}
		else
		{
			System.out.println((income*20)/100.0);
		}
	}

}
