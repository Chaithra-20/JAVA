package com.kodnest.day7.TicketPriceCalculation;

import java.util.Scanner;

public class TicketPriceCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String movieType=scan.nextLine();
		int age=scan.nextInt();
		
		if(age<=12)
		{
			if(movieType.equals("Matnie Show"))
			{
				System.out.println("7");
			}
			else
			{
			System.out.println("10");
			}
		}
		else
		{
			if(movieType.equals("Matnie Show"))
			{
				System.out.println("10");
			}
			else
			{
				System.out.println("15");
			}
		}
		

	}

}
