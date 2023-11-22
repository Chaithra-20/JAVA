package com.kodnest.practice.program1;

import java.util.Scanner;

public class LeafYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int year=scanner.nextInt();
		if((year%4==0 && year%100!=0 )|| year%400==0)
		{
			System.out.println(year+" is leap year");
		}
		else
		{
			System.out.println(year+" is not a leap year");
		}

	}

}
