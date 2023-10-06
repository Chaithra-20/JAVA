package com.kodnest.string.programs;

import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the First String");
		 String str1=scan.nextLine();
		 System.out.println("Enter the Second String");
		 String str2=scan.nextLine();
		 
		 StringCancatenation stringCancatenation=new StringCancatenation();
		 String res=stringCancatenation. ConcatString(str1, str2);
		 
		 if(res!=null)
		 {
			 System.out.println(res);
		 }
		 else
		 {
			 System.out.println("String are not Equal for concatitianting");
		 }
	}

}
