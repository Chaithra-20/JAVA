package com.kodnest.array.InsertionSort;

import java.util.Scanner;

public class Solution3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an Array ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements of array ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.print("array Contents are.....Before Soerting.....");
		
		System.out.println();
		for (int c : arr)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		SortInsertion sortInsertion=new SortInsertion();
		sortInsertion.insertionSort(arr);
		System.out.print("array contents are.....After Sorting....");
		System.out.println();
		for (int b : arr)
		{
			System.out.print(b+" ");
		}
	

	}

}
