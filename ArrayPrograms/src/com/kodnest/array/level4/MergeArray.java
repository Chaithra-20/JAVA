package com.kodnest.array.level4;

public class MergeArray {
	
	public int[] mergingArrays(int arr1[],int arr2[])
	{
		
		int merged[]=new int[arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			merged[i]=arr1[i];
			
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			merged[arr1.length+i]=arr2[i];
		}
		return merged;
	}
}
