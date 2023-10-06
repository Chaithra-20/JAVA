package com.kodnest.string.programs2;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		System.out.println("Orginal String is "+str);
		
//		ReverseWordString reverseWordString=new ReverseWordString();
//		String res=reverseWordString.reveseWord(str);
//		System.out.println("Reversed String is "+res);
		
		
		ReverseWordString reverseWordString=new ReverseWordString();
		String res2=reverseWordString.reverseStringWord(str);
		System.out.println("Reversed String is "+res2);
		scan.close();
	}

}
