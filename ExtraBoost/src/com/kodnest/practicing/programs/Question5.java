package com.kodnest.practicing.programs;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		int rem;
		String binary=" ";
		while(num>0)
		{
			rem=num%2;
			binary=rem+binary;
			num=num/2;
		}
		System.out.println(binary);

	}

}
