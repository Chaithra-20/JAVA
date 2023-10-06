package com.kodnest.array.level1;

import java.util.Iterator;
import java.util.Scanner;

public class Array11 {

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
		//traditional for loop
		//ctrl+shift+c(for commenting everyline 
		//	for(int i=0;i<=arr.length-1;i++)
	//	{
	//		System.out.print(arr[i]+" ");
	//	}
		 for (int c : arr)
		 {
		
			 System.out.print(c);
		}
		

	}

}
