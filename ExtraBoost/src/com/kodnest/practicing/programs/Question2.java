package com.kodnest.practicing.programs;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(i+"-"+j);
					
				}
			}
		}

	}

}
