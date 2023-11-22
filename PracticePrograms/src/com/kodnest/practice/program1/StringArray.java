package com.kodnest.practice.program1;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String arr[]=new String[scan.nextInt()];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.next();
		}
		System.out.println("Sring array elements are....");
		for (String string : arr) {
			System.out.print(string+" | ");	
			
		}
		System.out.println();
		
	
	
	boolean foundDuplicate=false;
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=i+1;j<=arr.length-1;j++)
		{
		if(arr[i].equals(arr[j]))
		{
			if(!foundDuplicate)
			{
				foundDuplicate=true;
			}
			System.out.println(arr[i]);
			break;
		}
		}
		}
		
	}
	
	

}
