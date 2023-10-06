package com.kodnest.array.level3;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the length of an array ");
		int arr1[]=new int[scan.nextInt()];
		int arr2[]=new int[arr1.length];
		
		System.out.println("Enter "+arr1.length+" elements of original array");
		
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr2[i]=arr1[i];
		}
		
		System.out.println("Array elements of original array  ");
		for(int r : arr1) {
			System.out.print(r+ " ");
		}
		System.out.println();
		System.out.println("copy of original array");
		for (int i=0;i<=arr2.length-1;i++)
		{
			System.out.print(arr2[i]+" ");
		}

	}

}
