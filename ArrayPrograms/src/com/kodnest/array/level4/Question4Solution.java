package com.kodnest.array.level4;

import java.util.Scanner;

public class Question4Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array length ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the elements which include both +ve and -ve values ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Before Replace ");
		for (int r : arr) {
			System.out.print(r+" ");
		}
		System.out.println();
		System.out.println("After Replace negative value ");
		ReplaceNegative replace=new ReplaceNegative();
		int res=replace.negativeToZero(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
