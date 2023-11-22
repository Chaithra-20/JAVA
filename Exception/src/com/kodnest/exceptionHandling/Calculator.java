package com.kodnest.exceptionHandling;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Welcome to Calculator Application");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int a=scanner.nextInt();
		System.out.println("Enter second number");
		int b=scanner.nextInt();
		multiply(a,b);
		System.out.println("*****************End of main() method");
				
	}

	public static void multiply(int a, int b) {
		System.out.println("multiply() method started");
		int product=a * b;
		System.out.println("Product= "+product);
		divide(a,b);
		System.out.println("*****************End of multiply() method");

	}

	public static void divide(int a, int b) {
		System.out.println("divide() method started");
		double quotient=0;
		try {
		 quotient=a/b;
		}
		catch(ArithmeticException ae){
			System.out.println("Exception Handled");
		}
		System.out.println("Quotient = "+quotient);
		System.out.println("*****************End of divide() method");

	}
	

}
