package com.kodnest.array.level4;

public class ReplaceNegative {
	
	int  negativeToZero(int arr[])
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			
			if(arr[i]<0)
				arr[i]=0;
		}
		return 0;
		
	}

}
