package com.kodnest.array.level5;

import java.util.Scanner;

public class Question1Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an Array ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the "+arr.length+" elements of an array ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the key to be searched ");
		int key=scan.nextInt();

		Search search=new Search();
		int res=search.binarySearch(arr, key);
		if(res==-1)
		{
			System.out.println("KEY NOT FOUND");
		}
		else
		{
			System.out.println("KEY FOUND at index "+res);
		}
		
	}

}
