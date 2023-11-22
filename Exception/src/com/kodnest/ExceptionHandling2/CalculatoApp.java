package com.kodnest.ExceptionHandling2;

import java.util.Scanner;

public class CalculatoApp {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		addition(a,b);
		subtraction(a,b);
		try {
		multiplication(a,b);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled in main() mathod");
		}
		try {
		division(a,b);
		}catch(Exception e)
		{
			System.out.println("Inside main() method: Exception is handled");
		}
		System.out.println("Program ended succesfully");
		scanner.close();
	}

	private static void division(int a, int b) throws Exception{
		System.out.println("division() method started....");
		double quotient=0;
		try {
			quotient=a/b;
		System.out.println("Division is : "+quotient);
		}
		catch(Exception e)
		{
//			System.out.println("Inside division method(): Exception is handled");
			throw e;
		}
		System.out.println("division method()Ended....");
		
	}

	private static void multiplication(int a, int b)throws Exception {
		System.out.println("multiplication() method started.....");
		System.out.println("Multiplication is : "+(a*b));
		System.out.println("multiplication() method ended....");
	}

	private static void subtraction(int a, int b) {
		System.out.println("subtraction() method started....");
		try {
			System.out.println("Subtraction is : "+(a-b));
		}
		catch (Exception e) {
			System.out.println("Exception Handled");
		}
		System.out.println("subtraction() method ended");
		
	}

	private static void addition(int a, int b) {
		System.out.println("addition() method is started..");
		System.out.println("Addition is : "+(a+b));
		System.out.println("addition method() ended....");
		
	}
}
