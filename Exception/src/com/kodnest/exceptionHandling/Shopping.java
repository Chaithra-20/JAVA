 package com.kodnest.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		System.out.println("Welcome to Shopping Application");
		shop();
		System.out.println("****************main() method ended********");
	}

	public static void shop() {
		System.out.println("---> shop() method started");
		try {
		pay();
		}
		catch(InputMismatchException a)
		{
			System.out.println("Shopping is failed due to the impropriate input");
		}
		System.out.println("*** shop() method ended*****");
	}

	public static void pay() throws InputMismatchException{
		//throws--> show warning to the method caller
		System.out.println("-----> pay() method started ");
		Scanner scan=null;
		System.out.println("Enter the amount paid = ");
		try {
			scan=new Scanner(System.in);
			double amount=scan.nextDouble();
			System.out.println("Amount paid = "+amount);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Exception Handled");
			throw ime;//re-throwing exception
		}
		scan.close();
		System.out.println("*****pay() method ended*******");
	}
	

}
