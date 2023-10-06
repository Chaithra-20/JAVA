package com.kodnest.string.programs3;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str=scan.nextLine();
		 
		
		RemovingDuplicates duplicates=new RemovingDuplicates();
		String res=duplicates.removeDuplicateCharacter(str);
		System.out.println(res);
	}

}
