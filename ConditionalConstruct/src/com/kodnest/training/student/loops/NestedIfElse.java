package com.kodnest.training.student.loops;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		
		if(num<50)
		{
			  System.out.println("Number is below 50 ");
			  if(num%2==0)
				  System.out.println("And this number is EVEN");
			  else
				  System.out.println("And this number is ODD");
		}
		else
		{
			System.out.println("Number is not below 50");
		}
		
	}

}
