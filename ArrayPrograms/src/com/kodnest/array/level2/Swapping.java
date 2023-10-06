package com.kodnest.array.level2;

import java.util.Iterator;
import java.util.Scanner;

public class Swapping {

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
		System.out.println("Before Swapping");
		for (int j : arr) 
		{	
			System.out.print(j+ " ");
			
		
		}
		System.out.println();
		System.out.println("Enter two indexes to swap: ");
		int m=scan.nextInt();
		int n=scan.nextInt();
		
		int help=arr[m];
		arr[m]=arr[n];
		arr[n]=help;
		
		System.out.println("After swapping");
		
		for (int k : arr) 
		{
			System.out.print(k+" ");
			
		}
		

	}

}
