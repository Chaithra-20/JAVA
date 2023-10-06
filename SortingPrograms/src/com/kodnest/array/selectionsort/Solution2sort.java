package com.kodnest.array.selectionsort;

import java.util.Scanner;

public class Solution2sort {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements of an array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array contents are.....Before Sorting.....");
		for (int x : arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		Sort2Selection sort2selection=new Sort2Selection();
		sort2selection.selection2Sort(arr);
		
		
		System.out.println("Array contents are......After Sorting......");
		for (int c : arr) 
		{
			System.out.print(c+" ");
		}
		
scan.close();

	}

}
