package com.kodnest.practice.program1;

import java.util.Scanner;

public class PalindromeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String arr[]=new String[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.next();
		}
		for (String string : arr) {
			
			System.out.println(string+"|");
		}
		System.out.println();
		
//		String arr1[]=new String[arr.length];
//		int j=arr.length-1;
//		for(int i=0;i<=arr.length-1;i++)
//		{
//			arr1[j]=arr1[i];
//			j--;
//		}
//		sysout
//
	}

}
