package com.kodnest.array.linearSearch;

import java.util.Scanner;



public class Solution2Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the length of an array ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter target Search array element");
		int target=scan.nextInt();
		Search search=new Search();
		boolean res=search.isPresent(arr, target);
		if(res==true)
		{
			System.out.println("Target Found in the array ");
		}
		else
		{
			System.out.println("Target not Found");
		}

	}

}
