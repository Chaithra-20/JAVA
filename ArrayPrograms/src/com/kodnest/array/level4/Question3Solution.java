package com.kodnest.array.level4;

import java.util.Scanner;

public class Question3Solution {

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
		
		System.out.println("Sum of Array is ");
		SumArray sumarray=new SumArray();
		int sum[]=sumarray.sumArray(arr1, arr2);
		for (int i : sum) {
			System.out.print(i+" ");
		}

	}

}
