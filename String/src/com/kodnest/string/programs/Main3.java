package com.kodnest.string.programs;

import java.util.Scanner;

public class Main3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scan.nextLine();
		
		UnicodeOfString unicodeOfString=new UnicodeOfString();
		unicodeOfString. unicode(str);
		
//		UnicodeOfString unicodeOfString=new UnicodeOfString(); 
//		unicodeOfString. unicode1(str);
		
		
	}
}
