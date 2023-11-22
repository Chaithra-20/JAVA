package com.kodnest.day5.factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		fact(n);

	}
	public static void fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
		fact=fact*i;
		
		}
		System.out.println(fact);
	}

}
