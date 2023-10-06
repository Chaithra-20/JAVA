package com.kodnest.array.linearSearch;

import java.util.Scanner;

public class Solution1Search {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the length of an array ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Search array element");
		int key=scan.nextInt();
		SearchArray search=new SearchArray();
		int res=search.linearSearch(arr, key);
		if(res==-1)
		{
			System.out.println("Key not found");
		}
		else
		{
			System.out.println("Key found at the index "+res);
		}
		

	}

}
