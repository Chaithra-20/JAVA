package com.kodnest.string.programs3;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str=scan.nextLine();
		
		DisplaySubString displaySubString=new DisplaySubString(); 
		displaySubString.subString(str);


	}

}
