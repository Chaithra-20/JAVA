package com.kodnest.array.level4;

public class SumArray {
	int [] sumArray(int arr1[],int arr2[])
	{
		int sum[]=new int[arr1.length];
		
	
			for(int i=0;i<arr1.length;i++)
			{
						sum[i]=arr1[i]+arr2[i];
					
				
			}
		
	
		return sum;
	}
}
