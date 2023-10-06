package com.kodnest.training.twodarray;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number of rows and columns where games and height are represented respectively");
		float arr[][]=new float[scan.nextInt()][scan.nextInt()];
		//float arr[][]=new float[4][3];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the height of game "+i+" player "+j);
				arr[i][j]=scan.nextFloat();
				
			}
		}	
			System.out.println("Array contents are....");
			{
			for(int i=0;i<=arr.length-1;i++)
			{
				for(int j=0;j<=arr[i].length-1;j++)
				{
			System.out.print(arr[i][j]+" ");
				}
				System.out.println();
		}

	}

	}
}
