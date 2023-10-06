package com.kodnest.array.selectionsort;

public class Sort2Selection {
	void selection2Sort(int arr[])
	{
		int max;
		int pos;
		int help;
		
		for(int i=0;i<=arr.length-2;i++)
		{
			max=arr[i];
			pos=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]> max)
				{
					max=arr[j];
					pos=j;
				}
			}
			//SWAPPING
			help=arr[i];
			arr[i]=arr[pos];
			arr[pos]=help;
		}
   	}

}
