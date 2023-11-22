package com.kodnest.practice.program1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		add(a,b);
		sub(a,b);
		mul(a,b);
		try {
			div(a,b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handles");
		}
		scanner.close();
	}

	private static void div(int a, int b) throws ArithmeticException{
		System.out.println("Division result: "+(a/b));
		
	}

	private static void sub(int a, int b) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Subtraction result: "+( a-b));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handling");
		}
		
	}

	private static void mul(int a, int b) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Multiplication result: "+(a*b));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handling");
		}
	}

	private static void add(int a, int b) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Addition result : "+(a+b));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handling");
		}
		
	}

}
