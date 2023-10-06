package com.kodnest.array.level4;

import java.util.Scanner;

public class Question2Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		 
		System.out.println("Enter the first array length");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter the elements of first Array ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		
		System.out.println("Enter the second array elements");
		
		int arr2[]=new int[scan.nextInt()];
		System.out.println("Enter the elements of second array");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=scan.nextInt();
		}
		
		
		MergeArray mergearray=new MergeArray();
		int[] merged=mergearray.mergingArrays(arr1, arr2);
		
		System.out.println("Merged Arrays ");
		for (int i : merged) 
		{
			System.out.print(i+" ");
		}

	}

}
