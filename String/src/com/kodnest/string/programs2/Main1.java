package com.kodnest.string.programs2;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		System.out.println("Orginal String is "+str);
		
		ReverseStringByPreservingWhiteSpace byPreservingWhiteSpace=new ReverseStringByPreservingWhiteSpace();
		String res=byPreservingWhiteSpace. reverseByPreservedWhiteSpace(str);
		System.out.println(res);
	}

}
