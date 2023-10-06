package com.kodnest.practicing.programs;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	
	
	int arr[]=new int[scan.nextInt()];
	
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
	}
	for (int i : arr)
	{
		System.out.print(i+" ");
	}
	int target=scan.nextInt();
	for (int x : arr)
	{
		if(arr[x]<target)
		{
		System.out.print((x-1)+"-"+x);
		break;
		}
	}

	}
}
