package com.kodnest.array.level1;

import java.util.Iterator;
import java.util.Scanner;

public class Array13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an array ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array contents are....");
		
		System.out.println("Display only the positive contents");

		for (int j : arr) 
		{
			if(j>0)
			{	
				System.out.print(j+ " ");
			}
			
		}
		

	}

}
