package com.kodnest.array.printForBack;

public class PrintArray {

	void printArray(int arr[])
	{
		System.out.println("Array contents in forward order are : ");
		for (int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Array contents in backward order");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}