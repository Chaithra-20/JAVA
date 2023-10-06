package com.kodnest.training.program;

import java.util.Scanner;

public class Calculator {
	Scanner scan=new Scanner(System.in);
	
	void addition()
	{
		System.out.println("Enter 2 numbers for addition");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Addition of "+a+ " and " +b+ " is "+(a+b));
		
	}

	void subtraction()
	{
		System.out.println("Enter 2 numbers for Subtraction");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Subtraction of "+a+ " and " +b+ " is "+(a-b));
		
		
	}
	
	void multiplication()
	{
		System.out.println("Enter 2 numbers for multiplication");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Multiplication of "+a+ " and " +b+ " is "+(a*b));
		
	}
	
	void Division()
	{
		System.out.println("Enter 2 numbers for Division");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Division of " +a+ " and " +b+ " is "+(a/b));
		
	}
	
	void remainder()
	{
		System.out.println("Enter 2 numbers to find remainder");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Remainder of " +a+ "and " +b+ " is "+(a%b));
		
	}
	
	void square()
	{
		System.out.println("Enter a number to find the square");
		int a=scan.nextInt();
		
		System.out.println("Square of the " +a+ " is "+(a*a));
		
	}
	
	
	
}
