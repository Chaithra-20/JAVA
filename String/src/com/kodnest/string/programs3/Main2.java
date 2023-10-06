package com.kodnest.string.programs3;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		
		ReplaceSpace99 replaceSpace99=new ReplaceSpace99();
		String res=replaceSpace99.replaceSpace(str);
		System.out.println(res);

	}

}
