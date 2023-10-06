package com.kodnest.training.student.loops;

import java.util.Scanner;

public class NestedIfElseLadder {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number ");
		int num1=scan.nextInt();
		System.out.println("Enter the second number ");
		int num2=scan.nextInt();
		
		if(num1>num2) {
			System.out.println("num1 is greater than num2");
		}
		else
		{
			if(num1==num2)
			{
				System.out.println("num1 is equal to num2 ");
			}
			else {
				System.out.println("num1 is less than num2 ");
			}
		}
	}

}
