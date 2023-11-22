package com.kodnest.practice.SunOfTwo;

import java.util.Scanner;

public class SumOfTwo {


	static int a;
	
	static int b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(calculator());;
	}
		
		
		public static int  calculator()
		{
			Scanner scan = new Scanner(System.in);
			 a=scan.nextInt();
			
		     b=scan.nextInt();
		    System.out.print("The sum is " );
		    return (a+b);
		}
				
	

}
