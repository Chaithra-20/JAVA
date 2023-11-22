package com.kodnest.day9.FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int num=scanner.nextInt();
		if(num%3==0 && num%5==0)
		{
			System.out.println("FizzBuzz");
		}
		else if(num%5==0)
		{
			System.out.println("Buzz");
		}
		else if(num%3==0)
		{
			System.out.println("Fizz");
		}
		else
		{
			System.out.println(num);
		}
			
		
	}

}
