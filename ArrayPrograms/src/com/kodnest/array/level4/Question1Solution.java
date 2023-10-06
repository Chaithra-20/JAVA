package com.kodnest.array.level4;

import java.util.Scanner;

public class Question1Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the array length ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements of an array");
		for(int i=0;i<=arr.length-1;i++)
		{
		arr[i]=scan.nextInt();
		
		}
		ArraySum arraysum=new ArraySum();
		int res=arraysum.findSum(arr);
		System.out.println("Sum of array elements is "+res);		
				
		

	}

}
