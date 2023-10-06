package com.kodnest.array.level1;

import java.util.Scanner;

public class Array12 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array contents are....");
		
		 for (int c : arr)
		 {
		
			 System.out.print((c+5)+ " ");
		}
		

	}

}
