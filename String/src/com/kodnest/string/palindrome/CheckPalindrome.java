package com.kodnest.string.palindrome;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string to check for palindrome  ");
		String s1=scan.nextLine();
		System.out.println("String before reversing....---> "+s1);
		Palindrome palin=new Palindrome();
		boolean res=palin.isPalindrome(s1);
		if(res==true)
		{
			System.out.println("Entered String is palindrome");
		}
		else
		{
			System.out.println("Entered String is Not-palindrome");

		}
		
		

	}

}
