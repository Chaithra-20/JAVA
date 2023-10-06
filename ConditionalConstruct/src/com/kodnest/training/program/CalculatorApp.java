package com.kodnest.training.program;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Calculator calculator=new Calculator();
		
		System.out.println("Hello user! Welcome to Kodnest Calculator........ ");
		while(true)
		{
			System.out.println(" Press + to perform addition....");
			System.out.println(" Press - to perform subtraction....");
			System.out.println(" Press * to perform multiplication....");
			System.out.println(" Press / to perform division....");
			System.out.println(" Press % to perform findRemainder....");
			System.out.println(" Press ^ to perform findSquare....");
			System.out.println(" Press ! to perform terminate....");
			char ch=scan.next().charAt(0);
			
		switch(ch)
		{
		case '+' :
			calculator.addition();
			break;
			
		case '-' :
			calculator.subtraction();
			break;
			
		case '*' :
			calculator.multiplication();
			break;
		
		case '/' :
			calculator.Division();
			break;
			
		case '%' :
			calculator.remainder();
			break;
			
		case '^' :
			calculator.square();
			break;
			
		case '!' :
			System.out.println("Tata Bye Bye CU");
			return;
			
		default :
			System.out.println("Go to Vasan Eye Care hospital and check your eyes properly ... see the ,essage properly and enter the valid choice");
		}
		
		
	//	Calculator calculator=new Calculator();
		//calculator.addition(num1,num2);
		//calculator.subtraction(num1,num2);
		//calculator.multiplication(num1,num2);
		//calculator.Division(num1,num2);
		//calculator.remainder(num1,num2);
		//calculator.terminate();
				
		
		

	}

}
}
