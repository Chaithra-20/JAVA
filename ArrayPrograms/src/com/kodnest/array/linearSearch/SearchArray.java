package com.kodnest.array.linearSearch;

public class SearchArray {
	int linearSearch(int arr[], int key)
	{
		int res=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
			
			return i;
			}
			
		}
		
		return -1;
	}

}
