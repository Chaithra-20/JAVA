package com.kodnest.string.programs;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the First String");
		 String str1=scan.nextLine();
		 System.out.println("Enter the Second String");
		 String str2=scan.nextLine();
		 
		LengthChecker lengthChecker=new LengthChecker();
		boolean res=lengthChecker.CheckLength(str1, str2);
				if(res==true)
				{
					System.out.println("Both Strings are of Equal length");
				}
				else
				{
					System.out.println("Both Strings are of Different length");
				}
	}

}
