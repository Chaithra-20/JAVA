package com.kodnest.string.programs;

import java.util.Scanner;

public class ConvertCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

	}

}
